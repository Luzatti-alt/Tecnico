Algoritmo "semnome"
Var
valor,desc,desctotal:real

Inicio
escreva("coloque o valor do produto: ")
leia(valor)
se valor <= 100 entao
 desc <- 0.05
 escrevaL("o valor do produto com desconto(5%) é: ",desctotal)
fimse//ok
se valor = 100.01 entao
 se valor <= 500 entao
 desc <- 0.1
 desctotal<- valor/desc
 escrevaL("o valor do produto com desconto(10%) é: ",desctotal)
 fimse
fimse
se valor > 500 entao
desc <- 1
escrevaL("o valor do produto com desconto(15%) é: ",desctotal)
fimse
Fimalgoritmo