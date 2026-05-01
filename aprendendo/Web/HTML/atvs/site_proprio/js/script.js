// Obtém o botão e o elemento de áudio
const button = document.getElementById('tocar');
const imgLata = document.getElementById('guarana-lata');
const guaranaSound = document.getElementById('guarana');

// Adiciona o evento de clique no botão
button.addEventListener('click', function() {
    if (imgLata.style.display === "none") {
        imgLata.style.display = "block";  // Exibe a imagem
    } else {
        imgLata.style.display = "none";  // Oculta a imagem
    }
    guaranaSound.play(); // Toca o som
});
