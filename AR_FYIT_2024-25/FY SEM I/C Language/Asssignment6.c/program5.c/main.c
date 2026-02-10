/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int num1, num2, num3;
    
 //taking input from user 
 
 
   printf("Enter Three Numbers : ");
   scanf("%d %d %d", &num1, &num2, &num3);
   
   if (num1 > num2 && num1 > num3){
       
       printf("This number is greater than other numbers :%d", num1);
   }
   
   else if (num2 > num1 && num2 > num3){
       
       printf("This number is greater than other numbers :%d", num2);
   }
   
   else if (num3 > num2 && num3 > num1){
       
       printf("This number is greater than other numbers :%d", num3);
   }
   
   else {
       
       printf("Invalid!!........Enter Again");
   }
   
    return 0;
}
