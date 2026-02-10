/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>
int main()
{
    int num;
    float factorial = 1;
    
    printf("Enter the number :");
    scanf("%d", &num);
    
    if(num <= 0)
    {
        printf("Factorial is not defined for negative numbers.\n");
    }
    
    else 
    {
        for (int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
    printf("Factorial of %d is = %.2f", num, factorial);   
    }
    
    return 0;
}