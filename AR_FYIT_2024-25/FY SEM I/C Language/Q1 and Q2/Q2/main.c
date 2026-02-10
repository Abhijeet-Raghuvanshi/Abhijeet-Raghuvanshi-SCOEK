
#include <stdio.h>

void swap(int, int);   
void swap(int a, int b)
{
    int temp;
    
    temp = a;    
    a = b;
    b = temp;
    
    printf("After Swapping : a = %d and b = %d\n", a, b);
};
   int main ()
   {
       int a, b;
       printf("Enter Two Numbers :");
       scanf("%d %d", &a, &b);
       
       printf("Your Entered Numbers : a = %d and b = %d\n", a, b);
       printf("Before Swapping : a = %d and b = %d\n", a, b);
       
       swap(a, b);

    return 0;
}
