#include<stdio.h>
int main()
{
    float a, b, sum;
    
    printf("Enter Two Numbers :");
    scanf("%f %f", &a, &b);
    
    sum = a / b;
    
    printf("%.f / %.f = %.3f", a, b, sum);
    
    return 0;
}