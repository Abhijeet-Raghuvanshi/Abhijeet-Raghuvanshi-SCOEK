#include <stdio.h>

int main()
{
   char arr[30];
   
   printf("Enter Your Name : ");
   fgets(arr, sizeof(arr), stdin);
   
   printf("Your name is : %s", arr);

    return 0;
}
