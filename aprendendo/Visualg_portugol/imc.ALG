Algoritmo "semnome"
Var
kg,h,h2,imc: real

Inicio
escreva("digite seu peso: ")
leia(kg)
escreva("digite sua altura: ")
leia(h)
h2 <- h*h
imc <- kg/h2
escreva("seu imc é: ", imc)
se imc <= 18.5 entao
escreva("abaixo do peso")
fimse
se imc >= 40 entao
escreva("obesidade III")
fimse
se imc >= 39.9 entao
escreva("obesidade II")
fimse
se imc >= 34.9 entao
escreva("obesidade I")
fimse
se imc >= 29.9 entao
escreva("excesso de peso")
fimse
se imc >= 24.9 entao
escreva("peso normal")
fimse
Fimalgoritmo