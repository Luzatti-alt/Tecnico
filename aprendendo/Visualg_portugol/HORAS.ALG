Algoritmo "HORAS"
Var
horas,preco:real
Inicio
escreval("Quantas horas: ")
leia(horas)
se horas < 1 então
preco <- 5
escreval("O valor é: ",horas*preco)
fimse
se horas <= 3 então
preco <- 10
escreval("O valor é: ",horas*preco)
fimse
se horas >= 3 então
preco <- 15
escreval("O valor é: ",horas*preco)
fimse

Fimalgoritmo