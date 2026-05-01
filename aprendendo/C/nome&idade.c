#include <stdio.h>

int main() {
    int idade;
    char nome[100];
    printf("Digite sua idade: ");
    scanf("%d", &idade); 
    printf("Digite seu nome: ");
    scanf("%s", nome); 
    printf("Sua idade é: %d\n", idade);
    printf("Seu nome é: %s\n", nome);
    return 0;
}
