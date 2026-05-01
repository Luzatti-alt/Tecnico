// --- Variáveis globais ---
let oscillator;
let isPlaying = false; // Controla se a música está tocando ou pausada
let pixelRatio, sizeOnScreen, segmentWidth;
let ac, gainNode, analyser, dataArray;
let canvas, c;
let animationId = null;
let mediaSource;
const tempoSlider = document.getElementById("tempo_atual");
const tempoLabel = document.getElementById("valor_tempo");
const powerBtn = document.getElementById("on");
const pausarBtn = document.getElementById("pausar");
const gainSlider = document.getElementById("gain");

// Elementos do DOM
const audio_output = document.getElementById("audio_output");
const player = document.getElementById("player-top");
const osciloscopioContainer = document.querySelector(".osciloscopio-container");

// Lista de músicas
const musicas = [
    "musicas/Another One Bites The Dust - Remastered 2011.mp3",
    "musicas/Hells Bells.mp3",
    "musicas/Highway to Hell.mp3",
    "musicas/Don’t Stop Me Now.mp3",
    "musicas/Radio Ga Ga - Remastered 2011.mp3",
    "musicas/I Was Made For Lovin’ You.mp3",
    "musicas/Thunderstruck.mp3",
    "musicas/Bohemian Rhapsody.mp3",
    "musicas/We Are The Champions.mp3",
    "musicas/Eye of the Tiger.mp3",
    "musicas/Back In Black.mp3",
    "musicas/Welcome To The Jungle.mp3",
    "musicas/Immigrant Song.mp3",
    "musicas/Smoke on the Water.mp3",
    "musicas/Dream On.mp3",
    "musicas/Free Bird.mp3",
    "musicas/Is This Love.mp3",
    "musicas/Here I Go Again.mp3",
    "musicas/Sharp Dressed Man - 2019 Remaster.mp3",
    "musicas/you shook me all night long.mp3",
    "musicas/Stairway To Heaven.mp3",
    "musicas/Jump - 2015 Remaster.mp3",
    "musicas/Shoot To Thrill.mp3",
    "musicas/Killer Queen.mp3",
    "musicas/Iron Man.mp3",
    "musicas/Paranoid (2012 Remaster).mp3",
    "musicas/Brighton Rock - Remastered 2011.mp3",
    "musicas/Paradise City.mp3",
    "musicas/Livin’ On A Prayer.mp3",
    "musicas/Paint It, Black.mp3",
    "musicas/Another Brick in the Wall, Pt2.mp3",
    "musicas/T.N.T.mp3",
    "musicas/Enter Sandman.mp3",
    "musicas/You Give Love A Bad Name.mp3",
    "musicas/Sweet Child O' Mine.mp3",
    "musicas/Under Pressure.mp3",
    "musicas/Fortunate Son.mp3"
];

let index = 0;

// --- Funções principais ---
function tocarMusica() {
    // Pausa e reseta antes de trocar
    audio_output.pause();
    audio_output.currentTime = 0;
    // Atualiza o src do áudio
    audio_output.src = musicas[index];

    // Limpa a animação anterior
    if (animationId) {
        cancelAnimationFrame(animationId);
        animationId = null;
    }
    c.clearRect(0, 0, canvas.width, canvas.height);
    // Garante que o contexto está ativo
    if (ac.state === "suspended") ac.resume();
    // Reproduz a música
    audio_output.play()
        .then(() => {
            console.log(`Tocando agora: ${musicas[index]}`);
            isPlaying = true;
            drawWaveform(); // reinicia a animação da onda
        })
        .catch(e => console.error("Erro ao tocar a música:", e));
}


function tocarProxima() {
    index = (index + 1) % musicas.length;
    tocarMusica();
}

function tocarAnterior() {
    index = (index - 1 + musicas.length) % musicas.length;
    tocarMusica();
}


function iniciarPlayer() {
    // Inicializa o contexto e elementos apenas uma vez
    if (!ac) ac = new AudioContext();

    canvas = document.getElementById("osciloscopio");
    c = canvas.getContext("2d");

    if (!audio_output) {
        console.error("Elemento <audio id='audio_output'> não encontrado.");
        return;
    }

    // --- Configuração dos nós de áudio ---
    if (!mediaSource) {
        gainNode = ac.createGain();
        analyser = ac.createAnalyser();
        analyser.smoothingTimeConstant = 0.85;
        analyser.fftSize = 2048;
        dataArray = new Uint8Array(analyser.frequencyBinCount);

        mediaSource = ac.createMediaElementSource(audio_output);
        mediaSource.connect(gainNode);
        gainNode.connect(analyser);
        analyser.connect(ac.destination);
    }

    // --- Canvas (tela de onda) ---
    ajustarCanvas();

    // Lógica para tocar/pausar
    if (audio_output.paused) {
        ac.resume().then(() => {
            audio_output.play().then(() => {
                isPlaying = true;
                drawWaveform();
                console.log("tocando");
            }).catch(e => console.error("Erro ao tocar:", e));
        });
    } else {
        audio_output.pause();
        isPlaying = false;
        // ac.suspend(); // Comentar ou remover para a onda parar ao pausar
        console.log("pausando");
    }
}

// --- Event Listeners ---

// Volume
if (gainSlider) {
    gainSlider.addEventListener("input", (e) => {
        const gain = e.target.value;
        gainNode.gain.value = gain;
        document.getElementById("gainValue").textContent = gain;
    });
}

// Quando a música termina
audio_output.addEventListener("ended", () => {
    isPlaying = false;
    tocarProxima(); // toca a próxima automaticamente
});

// Ajustar o canvas quando a janela for redimensionada
window.addEventListener("resize", ajustarCanvas);

// Inicializa o player quando a página carrega
window.onload = () => iniciarPlayer(0);

function formatarTempo(segundos) {
    const min = Math.floor(segundos / 60);
    const sec = Math.floor(segundos % 60);
    //padStart começa a string com o 00(exatos 2 characteres)
    //isso é so para iniciar o timer
    return `${String(min).padStart(2, "0")}:${String(sec).padStart(2, "0")}`;
}

// Atualiza o tempo da música em tempo real
audio_output.addEventListener("timeupdate", () => {
    if (!isNaN(audio_output.duration)) {
        const progresso = audio_output.currentTime / audio_output.duration;//
        tempoSlider.value = progresso;

        const tempoAtual = formatarTempo(audio_output.currentTime);
        const duracao = formatarTempo(audio_output.duration);
        tempoLabel.textContent = `${tempoAtual} / ${duracao}`;
    }
});

// Permite arrastar o controle para mudar o tempo
tempoSlider.addEventListener("input", () => {
    if (!isNaN(audio_output.duration)) {
        const novoTempo = tempoSlider.value * audio_output.duration;
        audio_output.currentTime = novoTempo;
    }
});

// --- Função de ajuste do Canvas ---
function ajustarCanvas() {
    if (!canvas || !osciloscopioContainer) return;

    pixelRatio = window.devicePixelRatio;
    // Ajusta o tamanho do canvas para preencher o contêiner
    const rect = osciloscopioContainer.getBoundingClientRect();
    sizeOnScreen = { width: rect.width, height: rect.height };

    canvas.width = sizeOnScreen.width * pixelRatio;
    canvas.height = sizeOnScreen.height * pixelRatio;

    canvas.style.width = `${sizeOnScreen.width}px`;
    canvas.style.height = `${sizeOnScreen.height}px`;
}


// --- Função de desenho da forma de onda ---
function drawWaveform() {
    if (!isPlaying) return;

    animationId = requestAnimationFrame(drawWaveform);
    analyser.getByteTimeDomainData(dataArray);

    c.fillStyle = "black";//cor de fundo
    //se for trocar a de cima mude a cor do player em si
    //pois qnd toca é qnd aparece a cor do fundo
    c.fillRect(0, 0, canvas.width, canvas.height);
    c.strokeStyle = "#D36F01";//cor da onda
    c.lineWidth = 2;
    c.beginPath();

    const width = canvas.width;
    const height = canvas.height;
    const sliceWidth = width / analyser.frequencyBinCount;

    let x = 0;
    for (let i = 0; i < analyser.frequencyBinCount; i++) {
        const v = dataArray[i] / 128.0;
        const y = (v * height) / 2;
        if (i === 0) c.moveTo(x, y);
        else c.lineTo(x, y);
        x += sliceWidth;
    }

    c.stroke();
}

// resetar a onda
window.onload = () => iniciarPlayer(0);
