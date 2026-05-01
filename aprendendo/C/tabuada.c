#include <stdio.h>
int main() {
    int var;
    printf("digite um número: ");
    scanf("%d", &var);
    for(int i=0;i<=10;i++){
    printf("%d x %d= %d\n", i, var,i*var);}//pode por as var e o resultado neste ex ele define a ordem do %d
    return 0;
}
