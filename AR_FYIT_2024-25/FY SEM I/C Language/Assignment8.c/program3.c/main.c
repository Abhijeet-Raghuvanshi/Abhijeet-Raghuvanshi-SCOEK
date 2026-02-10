#include <stdio.h>
int main()
{
    int n,i,sum = 0;
    float avg;
    
    printf("Enter the number of elements :");
    scanf("%d", &n);
    
    int arr[n];
    
    printf("Enter intergers %d :", n);
    
    for(i = 0; i < n; i++){
        
        printf("\nElement %d :", i + 1);
        scanf("%d", &arr[i]),
        
        sum += arr[i];
    }
    
    avg = (float)sum / n;
    
    printf("\nThe sum of elements : %d", sum);
    printf("\nThe average of elements : %.2f", avg);
    
    return 0;
}