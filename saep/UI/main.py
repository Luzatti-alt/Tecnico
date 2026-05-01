from kivy.app import App
from kivy.uix.screenmanager import ScreenManager, Screen, FadeTransition
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
from kivy.uix.label import Label
from kivy.uix.textinput import TextInput
from kivy.core.window import Window

Window.clearcolor = (0.1, 0.1, 0.1, 1)  # fundo escuro

class LoginScreen(Screen):
    def __init__(self, **kwargs):
        super().__init__(**kwargs)
        layout = BoxLayout(orientation="vertical", padding=40, spacing=25)
        layout.add_widget(Label(text="Login", font_size=40, color=(1,1,1,1)))
        self.usuario = TextInput(
            hint_text="Usuário", multiline=False,
            size_hint_y=None, height=45
        )
        layout.add_widget(self.usuario)
        self.senha = TextInput(
            hint_text="Senha", multiline=False, password=True,
            size_hint_y=None, height=45
        )
        layout.add_widget(self.senha)
        btn = Button(text="Entrar", size_hint_y=None, height=50)
        btn.bind(on_release=self.entrar)
        layout.add_widget(btn)
        self.add_widget(layout)
    def entrar(self, *args):
        self.manager.current = "gestao"


class GestaoScreen(Screen):
    def __init__(self, **kwargs):
        super().__init__(**kwargs)
        layout = BoxLayout(orientation="vertical", padding=20, spacing=15)
        layout.add_widget(Label(text="Gestão", font_size=35, color=(1,1,1,1)))
        #controle
        btn_controle = Button(text="Ir para controle", on_release=lambda x: self.ir_controle())
        layout.add_widget(btn_controle)
        #cadastro
        btn_cadastro = Button(text="Ir para Cadastro", size_hint_y=None, height=50)
        btn_cadastro.bind(on_release=lambda x: self.ir_cadastro())
        layout.add_widget(btn_cadastro)
        #logout
        btn_sair = Button(text="Sair", size_hint_y=None, height=50)
        btn_sair.bind(on_release=lambda x: self.sair())
        layout.add_widget(btn_sair)
        self.add_widget(layout)
    def ir_cadastro(self):
        self.manager.current = "cadastro"
    def ir_controle(self):
        self.manager.current = "controle"
    def sair(self):
        self.manager.current = "login"
class ControleScreen(Screen):
    def __init__(self, **kwargs):
        super().__init__(**kwargs)
        btn = Button(text="Salvar", size_hint_y=None, height=50)
        btn.bind(on_release=self.entrar)
        layout.add_widget(btn)
class CadastroScreen(Screen):
    def __init__(self, **kwargs):
        super().__init__(**kwargs)
        layout = BoxLayout(orientation="vertical", padding=20, spacing=15)
        layout.add_widget(Label(text="Cadastro", font_size=35, color=(1,1,1,1)))
        self.nome = TextInput(
            hint_text="Nome", multiline=False,
            size_hint_y=None, height=45
        )
        layout.add_widget(self.nome)
        self.email = TextInput(
            hint_text="Email", multiline=False,
            size_hint_y=None, height=45
        )
        layout.add_widget(self.email)
        btn_salvar = Button(text="Salvar", size_hint_y=None, height=50)
        layout.add_widget(btn_salvar)
        btn_voltar = Button(text="Voltar", size_hint_y=None, height=50)
        btn_voltar.bind(on_release=lambda x: self.voltar())
        layout.add_widget(btn_voltar)
        self.add_widget(layout)
    def voltar(self):
        self.manager.current = "gestao"

#app
class MeuApp(App):
    def build(self):
        sm = ScreenManager(transition=FadeTransition())
        #telas
        sm.add_widget(LoginScreen(name="login"))
        sm.add_widget(GestaoScreen(name="gestao"))
        sm.add_widget(CadastroScreen(name="cadastro"))
        sm.add_widget(ControleScreen(name="controle"))
        return sm

#qnd iniciar chamar app
if __name__ == "__main__":
    MeuApp().run()