#include <stdio.h>
int main() {
    int tempo;
    printf("digite quantas horas:\n");
    scanf("%d",&tempo);//ok
    if(tempo < 1){
        printf("o valor pago será: 5R$\n");
        printf("o total de horas é: %d", tempo,"\n");}
    else{
        if(tempo < 3){
            printf("o valor pago será: 10R$\n");
            printf("o total de horas é: %d", tempo,"\n");
        }
        else{
            printf("o valor pago será: 20R$\n");
            printf("o total de horas é: %d", tempo,"\n");  
        }
     }
    return 0;}
