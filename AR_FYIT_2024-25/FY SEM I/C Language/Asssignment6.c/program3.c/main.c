/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
   int year;
   
   printf("Enter the Year (XXXX) : ");
   scanf("%d", &year);
   
   if (year % 4 == 0){
       
       printf("This year is a leap Year!!", year);
   } else {
       
       printf("This is not a leap year", year);
   }

    return 0;
}