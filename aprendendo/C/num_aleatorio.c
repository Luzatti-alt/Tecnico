#include <stdio.h>
#include <stdlib.h>
int main(){
    int tenta=5;//num tentativas
    int ntenta;
    int ale = rand() % 69; //ver como limitar o rand()
    //printf("%d\n",ale);
    printf("número restantes de tentativas: %d\n",tenta);
    printf("digite um número(MAX: 40): ");
    scanf("%d",&ntenta);
    while(ntenta!=ale){
        if(tenta==1){
            printf("DERROTA");
            break;}else{
                if(ntenta>ale){
                    printf("seu número é menor\n");
                }else{
                    printf("seu número é maior\n");}
        tenta--;//ok até aqui
        printf("número restantes de tentativas: %d\n",tenta);
        printf("digite um número: ");
        scanf("%d",&ntenta);
            }
    }
    if(ntenta==ale){
            printf("VITORIA");
        }
        return 0;
}
