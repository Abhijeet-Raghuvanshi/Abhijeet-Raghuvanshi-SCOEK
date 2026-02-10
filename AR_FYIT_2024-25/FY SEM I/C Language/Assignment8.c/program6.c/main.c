#include <stdio.h>

int main()
{
    int n, i, key, found = 0;
    
    printf("Enter the number of Array elements :");
    scanf("%d", &n);
    
    int arr[n];
    
    for(i = 0; i < n; i++){
        
        printf("\nEnter Element %d :", i + 1);
        scanf("%d", &arr[i]);
    }
    
    printf("Enter number to search in given array : ");
    scanf("%d", &key);
    
    for(i = 0; i < n; i++){
        
        if(arr[i] == key){
            printf("The number %d is found at the position %d.\n", key, i + 1);
            found = 1;
            break;
        }
    } 
    
    if (!found) {
        printf("Number %d is not found in the given array.\n", key);
        
    }
    
    return 0;
}
