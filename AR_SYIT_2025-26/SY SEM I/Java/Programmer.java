class Employee
{
	int salary = 25000;
	void show()
	{
		System.out.println("Employee Class");
	}
}

public class Programmer extends Employee
{
	int bonus = 10000;
	void display()
	{
		System.out.println("Programmer Class");
	}

	public static void main(String args[])
	{
		Programmer p1 = new Programmer();

		p1.display();
		p1.show();

	}
}