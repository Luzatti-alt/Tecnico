#include <stdio.h>

int main() {
    int i=1000;
    printf("%d \n",i);
     i-=10;
 while(i<=1000){
     printf("%d \n",i);
     i-=10;
     if (i <= -10){
         break;
     }
 }
    return 0;
}

