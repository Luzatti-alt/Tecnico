#include <stdio.h>
int main() {
    int i=0;
 while(i<=10){
     printf("%d \n",i);
     i+=1;
     if (i >= 6){
         break;
     }
 }
    return 0;
}
