import java.util.*;
public class Swap2
{
	public static void main(String args[])
	{
		int a, b;
		System.out.println("Swapping of Numbers :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :");
		a = sc.nextInt();
		System.out.println("Enter the Second Number :");
		b = sc.nextInt();
		
		System.out.println("Numbers before Swapping :");
		System.out.println("First number :" +a);
		System.out.println("Second Number :" +b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Number After Swapping:");
		System.out.println("First Number : " +a);
		System.out.println("Second Number : " +b);
				
	}
} 