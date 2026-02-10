import java.util.Scanner;
public class Sum{
public static void main (String args[]){
int size, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array :");
size = sc.nextInt();
System.out.println("Enter Numbers :");
int a[] = new int[size];
for(int i = 0; i <size; i++){
a[i] = sc.nextInt();
sum = size + a[i];
}
System.out.println("Addition is :"+sum);
}
}