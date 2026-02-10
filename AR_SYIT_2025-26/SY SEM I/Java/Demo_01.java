public class Demo_01
{
	int roll = 0;
	String name = null;
	public Demo_01(int roll, String name)
	{
		roll = roll;
		name = name;
		System.out.println(name+" "+roll);
	}
	public static void main(String[] args)
	{
		Demo_01 d = new Demo_01(51, "Abhijeet");
	}
}