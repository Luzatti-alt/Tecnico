Algoritmo "Notas"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
Var
A,B,C,D:caracter

Inicio
escreva("digite a nota do aluno A: ")
leia(A)
escreva("digite a nota do aluno B: ")
leia(B)
escreva("digite a nota do aluno C: ")
leia(C)
escreva("digite a nota do aluno D: ")
leia(D)
se A >= 9 entao
escreval("A: ",A," => 9")
fimse  //ok
se B < 9 entao
 se B >= 7 entao
 escreval("B: 7 < ",b," < 9")
 fimse
fimse//ok
se C < 5 entao
 se C > 7 entao
 escreval("C: 5 < ",C," < 7")
 fimse
fimse//ok
se D < 5 entao
 escreva("D: ",D," < 5")
 se D=5 entao
 escreva("D: ",D," = 5")  //devia printar no cmd mas nn aparece
 fimse
fimse
Fimalgoritmo