#include<stdio.h>

int main(){
    int a,b,c;
    printf("Enter Three Sides Of Triangles:\n");
    scanf("%d\n%d\n%d",&a,&b,&c);

    if(a == b && b == c){
        printf("The Triangle Is equilateral triangle.");
    }
    else if(a == b||a == c||b == c){
        printf("The Triangle Is isoceles triangle.");
    }
    else if(a*a == b*b+c*c||b*b == c*c+a*a||c*c == a*a+b*b){
        printf("The Triangle Is right-angled triangle.");
    }
    else{
        printf("None of these");
    }
    return 0;
}
