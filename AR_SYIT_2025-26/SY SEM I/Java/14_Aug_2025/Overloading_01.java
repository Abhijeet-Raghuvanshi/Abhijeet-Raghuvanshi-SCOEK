public class Overloading_01
{
	public void add()
	{
		int a = 16;
		int b = 18;

		int c = a + b;

		System.out.println("Addition is : " +c);
	}
	
	public int add(int a, int b)
	{
		return a + b;
	}

	public double add(double a, double b)
	{
		return a + b;
	}

	public float add(float a, float b)
	{
		return a + b;
	}
	
	public static void main(String args[])
	{
		Overloading_01 o = new Overloading_01();

		o.add();

		int i = o.add(45, 50);
		System.out.println("Addition of Two Integers : " +i);

		double d = o.add(45.5, 45.5);
		System.out.println("Addition of Two Double Floating point Numbers : " +d);

		double f = o.add(5.9, 5.1);
		System.out.println("Addition of Two Floating point Numbers : " +f);
	}
}