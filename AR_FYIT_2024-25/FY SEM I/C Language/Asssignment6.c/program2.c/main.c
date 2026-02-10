/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
   int num;
   
   printf("Enter the number : ");
   scanf("%d", &num);
   
   if (num % 2 == 0){
       
       printf("The number is even", num);
   } else {
       
       printf("Number is odd", num);
   }

    return 0;
}