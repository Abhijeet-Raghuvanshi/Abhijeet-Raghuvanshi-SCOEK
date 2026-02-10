import java.util.*;
public class Voting
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = input.nextInt();
		
		if(age < 18)
		{
			System.out.println("Invalid age input");
			throw new ArithmeticException("Age should be greater then 18");
		}

		else
		{
			System.out.println("Eligible for voting");
			System.out.println("Press 1.Kshitij Shinde 2.Shubham Khedkar 3. Abhijeet Raghuvanshi To Vote");
		}
	}
}