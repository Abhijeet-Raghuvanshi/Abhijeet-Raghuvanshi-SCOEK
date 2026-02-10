/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int a,b,swap;
    
    printf("Enter Two numbers :");
    scanf("%d %d", &a, &b);
    
    printf("Before swapping = a =%d, b =%d\n", a, b);
    
    swap = a;
    a = b;
    b = swap;
    
    printf("After swapping : a =%d, b =%d\n", a, b);

    return 0;
}
