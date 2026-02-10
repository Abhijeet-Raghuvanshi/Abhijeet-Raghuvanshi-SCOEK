#include <stdio.h>
int main (){
    int n, i;
    
    printf("Enter the number of elements : ");
    scanf("%d", &n);
    
    int even = 0, odd = 0;
    int arr[n];
    
    printf("\nEnter any %d integers :", n);
    
    for (i = 0; i < n; i++){
        
        printf("\nEnter Element: %d :", i + 1);
        scanf("%d", &arr[i]);
    }
     
     for(i = 0; i< n; i++){
         
         if(arr[i] % 2 == 0){
             
             even += arr[i];
         } else {
             odd += arr[i];
         }
     }
     
     printf("\nSun of all even integer in the given %d integers are: %d", n, even);
     printf("\nSun of all odd integer in the given %d integers are: %d", n, odd);
      
      return 0;
}