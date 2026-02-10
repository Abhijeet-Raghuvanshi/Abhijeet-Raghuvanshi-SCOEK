/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Area of room//
#include<stdio.h>
int main()
{
   
   int l,b,area;

printf("enter length of room:");
scanf("%d", &l);

printf("enter breadth of room:");
scanf("%d", &b);

area = l * b;

printf("area od room is: %d",area);
}