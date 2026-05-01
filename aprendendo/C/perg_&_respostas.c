#include <stdio.h>
int main() {
  char resp;
  int qper = 1; int pnts = 1000;
  printf("Há um total de 10 perguntas,responda entre A,B,C,D (em minuscula) \n");
  printf("sua pontuação padrão é:"); printf("%d", pnts); printf("\n");
  printf("1)Qual famoso físico descobriu o conceito de gravidade?\n"); printf("a)Albert Einstein\n"); printf("b)Isaac Newton\n"); printf("c)Galileo Galilei\n"); printf("d)Niels Bohr\n");
  scanf(" %c", &resp);
  if (qper = 1 && resp == "b") {
    pnts -= 100; qper = 2;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 2;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("2) Qual é o símbolo químico para água?\n");  printf("a)H2O \n"); printf("b)CO2\n"); printf("c)NaCl\n"); printf("d)O2\n");
  scanf(" %c", &resp);
  if (qper = 2 && resp == "a") {
    pnts -= 100; qper = 3;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 3;
    printf("sua pontuação é:"); printf("%d", pnts);  printf("\n");}
  printf("3)Qual força nos mantém no chão na Terra ?\n"); printf("a)Magnetismo\n"); printf("b)Atrito\n"); printf("c)Gravidade \n"); printf("d)Tensão\n");
  scanf(" %c", &resp);
  if (qper = 3 && resp == "c") {
    pnts -= 100; qper = 4;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 4;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("4)Como é chamado o centro de um átomo ?\n"); printf("a)Elétron\n"); printf("b)Nêutron\n"); printf("c)Próton\n"); printf("d)Núcleo \n");
  scanf(" %c", &resp);
  if (qper = 4 && resp == "d") {
    pnts -= 100; qper = 5;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 5;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("5)Quanto tempo leva para a Terra orbitar o Sol ?\n"); printf("a)24 horas\n"); printf("b)30 dias\n"); printf("c)365 dias\n"); printf("d)365 horas\n");
  scanf(" %c", &resp);
  if (qper = 5 && resp == "a") {
    pnts -= 100; qper = 6;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    resp += 100; qper = 6;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("6)Qual parte do átomo tem carga positiva ?\n"); printf("a)Nêutron\n"); printf("b)Próton\n"); printf("c)Elétron\n"); printf("d)Núcleo\n");
  scanf(" %c", &resp);
  if (qper = 6 && resp == "b") {
    pnts -= 100; qper = 7;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 7;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("7)Qual é a fórmula química do sal de cozinha ?\n"); printf("a)NaCl\n"); printf("b)KCl\n"); printf("c)CaCO3\n"); printf("d)MgSO4\n");
  scanf(" %c", &resp);
  if (qper = 7 && resp == "a") {
    pnts -= 100; qper = 8;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 8;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("8)Que tipo de animal é o dragão de Komodo ?\n"); printf("a)Mamífero\n"); printf("b)Ave\n"); printf("c)Réptil\n"); printf("d)Anfíbio\n");
  scanf(" %c", &resp);
  if (qper = 8 && resp == "c") {
    pnts -= 100; qper = 9;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 9;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("9)Qual é o símbolo químico do cobre?\n"); printf("a)Ca\n"); printf("b)Cr \n"); printf("c)Cu\n"); printf("d)K\n");
  scanf(" %c", &resp);
  if (qper = 9 && resp == "c") {
    pnts -= 100; qper = 10;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100; qper = 10;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  printf("10)  De que elemento é feito um diamante ?\n"); printf("a)Carbono\n"); printf("b)Silício\n"); printf("c)Oxigênio\n"); printf("d)Nitrogênio\n");
  scanf(" %c", &resp);
  if (qper = 10 && resp == "a") {
    pnts -= 100;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");
  } else {
    pnts += 100;
    printf("sua pontuação é:"); printf("%d", pnts); printf("\n");}
  return 0;}
