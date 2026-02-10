#include <stdio.h>

int main(){
    float a,b,c,discriminant,root1,root2,real_part,img_part;
    printf("Enter the coefficients a, b and c:");
    scanf("%f %f %f",&a,&b,&c);

    discriminant = b*b - 4*a*c;

    if(discriminant>0){
        root1 = (-b +(discriminant))/(2*a);
        root2 = (-b -(discriminant))/(2*a);
        printf("Roots are real and different.\n");
        printf("Root1 = %.2f and Root2 =%.2f",root1,root2);
    }
    else if(discriminant ==0){
        root1 = root2 = -b/(2*a);
        printf("Roots are real and same.\n");
        printf("Root1 = Root2 =%.2f",root1);
    }
    else{
        real_part = -b/(2*a);
        img_part =  sqrt(-discriminant)/(2*a);
        printf("Root1 = %.2f + %.2f and Root2 = %.2f -%.2f",real_part,img_part,real_part,img_part);
    }
    return 0;
}
