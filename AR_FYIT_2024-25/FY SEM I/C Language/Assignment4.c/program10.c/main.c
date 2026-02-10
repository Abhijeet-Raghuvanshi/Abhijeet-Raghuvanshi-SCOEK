/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//this is the c program to display the size of integer, variable, float//
#include<stdio.h>
int main()
{
    int num1;
    float num2;
    char sai;
    printf("the size of num1 is:%zu byte\n",sizeof(num1));
    printf("the size of num2 is:%zu byte\n",sizeof(num2));
    printf("the size of sai is:%zu byte",sizeof(sai));
}