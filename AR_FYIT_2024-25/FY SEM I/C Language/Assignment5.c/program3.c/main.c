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
  
  if (operator == '+'){
      
      printf("he Addition of two number is :%f", num1 + num2);
  }
  
  else if (operator == '-'){
      
      printf("he Substraction of two number is :%f", num1 - num2);
  }
  
  else if (operator == '*'){
      
      printf("he Multiplication of two number is :%f", num1 * num2);
  }
  
  else if (operator == '/'){
      
      printf("he division of two number is :%f", num1 / num2);
  }
  
 
  
  else {
      
      printf("Invalid Operator!!......Enter Again");
  }
  
  return 0;
}