interface Parent1
{
	public void display();	

}

interface Parent2
{
	public void display();

}

public class Child2 implements Parent1, Parent2
{
	void display()
	{
		System.out.println("Parent 1 and Parent 2");
	}

	public static void main(String args[])
	{
		Child2 c = new Child2();

		c.display(); 
	}
}