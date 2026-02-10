import java.util.*;
public class Fibo
{
	public static void main(String args[])
	{
		int a = 0, b = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series Number :");
		n = sc.nextInt();

		System.out.println("The Series :");


		if(n <= 0)
		{
			System.out.println("Please Enter a Positive Number");
		}

		else if(n == 1)
		{
			System.out.println(a);
		}

		else
		{
			System.out.println(a);
			System.out.println(b);

			for(int i = 2; i < n; i++)
			{	
				System.out.println(fibo(i) + " ");

			}
		}
	}

	public static int fibo(int i)
	{
		if(n <= 1) return n;
		
		return fibo(n - 1) + fibo(n - 2);
	}
}