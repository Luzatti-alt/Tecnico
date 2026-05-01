#include <stdio.h>

int main() {
    int idade;
    printf("digite sua idade: ");
    scanf("%d",&idade);
    if (idade >= 18){
        printf("maior de idade");
    } else{
        printf("menor de idade");
    }
    return 0;
}

