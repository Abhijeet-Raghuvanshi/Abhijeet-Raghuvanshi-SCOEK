import java.util.Scanner;
public class Fact{
public static void main(String args[]) {
	int a, fact = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find factorial :");
	a = sc.nextInt();
	for(int i = 1; i <= a; i++){
		fact *= i;	
	}
	System.out.println("Factorial is : "+fact);
}	
}