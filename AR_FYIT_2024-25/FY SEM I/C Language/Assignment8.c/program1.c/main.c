#include <stdio.h>

int main() {
    int arr[10];
    int i;

    printf("Enter 10 integers:\n");
    for(i = 0; i < 10; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("\nThe entered 10 integers are:\n");
    for(i = 0; i < 10; i++) {
        printf("Element %d: %d\n", i + 1, arr[i]);
    }

    return 0;
}
