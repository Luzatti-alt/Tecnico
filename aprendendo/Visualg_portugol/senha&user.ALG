Algoritmo "semnome"
Var
user,senha,tentativaUser,tentativaSenha:caracter
Inicio
user <- "admin"
senha <- "senha123"
escreva("digite sue usuario: ")
leia(tentativaUser)
se tentativaUser = user entao
 escreva("digite sua senha: ")
 leia(tentativaSenha)
 se tentativaSenha = senha entao
 escreva("logado")
 senao
 escreva("acesso negado")
 fimse
senao
escreva("acesso negado")
fimse
Fimalgoritmo