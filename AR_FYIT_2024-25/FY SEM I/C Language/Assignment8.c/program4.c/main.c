#include <stdio.h>

int main() {
    int n; 
    int i;

    
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n], copyArr[n]; 

    printf("Enter %d integers:\n", n);
    for(i = 0; i < n; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

 
    for(i = 0; i < n; i++) {
        copyArr[i] = arr[i];
    }

 
    printf("\nOriginal Array:\n");
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    printf("\nCopied Array:\n");
    for(i = 0; i < n; i++) {
        printf("%d ", copyArr[i]);
    }

    return 0;
}
