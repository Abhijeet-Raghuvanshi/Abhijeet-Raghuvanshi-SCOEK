/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>
int main()
{
  float basic_salary = 15000;
  float hra, da, net_salary;

  hra = 0.20 * basic_salary;
  da =  0.30 * basic_salary;

  net_salary = hra +  da + basic_salary;

  printf("Basic Salary : %.2f\n", basic_salary);
  printf("HRA : %.2f\n", hra);
  printf("DA : %.2f\n", da);
  printf("Net Salary : %.2f\n", net_salary);
}