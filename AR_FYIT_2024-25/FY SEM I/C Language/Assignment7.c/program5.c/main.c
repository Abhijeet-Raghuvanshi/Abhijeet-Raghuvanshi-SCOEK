#include<stdio.h>

int main(){
    int i ,sum=0;

    printf("Numbers between 0 and 100,divisible by 4:\n");
    for(i=1;i<100;i++){
        if(i%4==0){
            printf("%4d",i);
            sum += i;
        }
    }
    printf("\n\nSum:%d\n",sum);
}
