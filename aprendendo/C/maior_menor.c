#include <stdio.h>

int main() {
    int n1,n2;
    printf("digite um número: ");
    scanf("%d", &n1);
    printf("digite um número: ");
    scanf("%d", &n2);
    printf("O maior é: ");
    if (n1<n2){
        printf("%d",n2);
    }else{
        printf("%d",n1);
    }
    return 0;
}
