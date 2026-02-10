public class Exception2
{
public static void main(String[] args)
{

	int a = 51;
	int b = 0;
	int c = a+b;
	System.out.println("Addition is " +c);

	try
	{
		int d = a/b;
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Error: Cannot divide by 0");
	}
	
	int s = a - b;
	System.out.println("Subtraction is " +s);

	System.out.println("Executed");

}
}