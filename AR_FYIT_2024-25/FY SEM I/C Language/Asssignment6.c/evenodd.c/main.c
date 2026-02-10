/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
   int num;
   
   printf("Enter the number : ");
   scanf("%d", &num);
   
   if (num > 0){
       
       printf("The number is positive", num);
   } else {
       
       printf("Number is negative", num);
   }

    return 0;
}