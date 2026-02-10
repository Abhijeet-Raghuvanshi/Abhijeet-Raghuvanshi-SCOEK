import java.util.*;
public class Factorial1{
public int fact(int n){
int total = 1;
if(n >= 1){
total = n * fact(n - 1);
}
return total;

}
public static void main(String args[]){
int num;
System.out.println("Enter the number :");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
Factorial1 f = new Factorial1();
System.out.println("Factoria is :" +f.fact(num));
}
}