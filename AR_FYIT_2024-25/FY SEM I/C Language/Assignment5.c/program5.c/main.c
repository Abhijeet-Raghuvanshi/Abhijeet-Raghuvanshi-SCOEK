/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//simple intrest//
#include<stdio.h>
int main()
{
    float principal, rate, time, simple_interest;

    // Input principal amount
    printf("Enter the principal amount: ");
    scanf("%f", &principal);

    // Input rate of interest
    printf("Enter the rate of interest: ");
    scanf("%f", &rate);

    // Input time period in years
    printf("Enter the time period (in years): ");
    scanf("%f", &time);

    // Calculate simple interest
    simple_interest = (principal * rate * time) / 100;

    // Display the result
    printf("The simple interest is: %f\n", simple_interest);
}