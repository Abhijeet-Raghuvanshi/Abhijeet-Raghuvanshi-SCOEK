class Parent
{
	String surname = "Raghuvanshi";
	int balance = 500000;
	public void display()
	{
		System.out.println("Surname : " + surname + " Balance : " + balance);
	}	
}

public class Child extends Parent
{
	public static void main(String[] args)
	{
		Child c1 = new Child();
		c1.display();	
	}
}