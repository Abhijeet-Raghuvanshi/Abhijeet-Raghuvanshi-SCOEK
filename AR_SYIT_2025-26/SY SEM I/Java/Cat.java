class Animals
{
	public void Voice()
	{
		System.out.println("In Animal Voice");
	}
}

public class Cat extends Animals
{
	public void work()
	{
		System.out.println("In work of Animal");
	}

	public static void main(String[] args)
	{
		Cat c = new Cat();
		c.voice();
		c.work();
	}

}