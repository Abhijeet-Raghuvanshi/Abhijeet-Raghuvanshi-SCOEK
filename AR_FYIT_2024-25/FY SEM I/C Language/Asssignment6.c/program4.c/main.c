/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
  char operator;
  float num1, num2, result;
  
  //Taking input from user
  
  printf("Enter Operator (+, -, / , *) : ");
  scanf("%c", &operator);
  
  printf("Enter Two Numbers : ");
  scanf("%f %f", &num1, &num2);
  
  switch(operator)
  {
      case '+' : result = num1 + num2;
                 
                 printf("The Addition of two number is :%.2f", result);
      break;      
      
       case '-' : result = num1 - num2;
                 
                 printf("The Substraction of two number is :%.2f", result);
      break;
      
       case '*' : result = num1 * num2;
                 
                 printf("The multiplication of two number is :%.2f", result);
      break;
      
       case '/' : result = num1 / num2;
                 
                 printf("The Division of two number is :%.2f", result);
      break;
  }
    return 0;
}