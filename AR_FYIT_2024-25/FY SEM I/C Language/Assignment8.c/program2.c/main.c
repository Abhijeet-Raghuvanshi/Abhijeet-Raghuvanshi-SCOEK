#include <stdio.h>

int main() {
    int n,i;
    
    printf("Enter the number of elements :");
    scanf("%d", &n);
    
    int arr[n];


    for(i = 0; i < n; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("\nThe entered integers are:\n");
    for(i = 0; i < n; i++) {
        printf("Element %d: %d\n", i + 1, arr[i]);
    }

    return 0;
}