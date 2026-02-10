class Parent
{
	void name()
	{
		System.out.println("Yogesh");
	}
}

class Child extends Parent
{
	void name()
	{
		super.name();
		System.out.println("Abhijeet");
	}

	public static void main(String args[])
	{
		Child c = new Child();

		c.name();
	}
}