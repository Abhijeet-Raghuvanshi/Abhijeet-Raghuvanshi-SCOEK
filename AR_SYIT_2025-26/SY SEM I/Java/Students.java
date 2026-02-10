public class Students
{
	int roll;
	String name;
	int marks;

	public Students(int roll, String name, int marks)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public void Display()
	{
		System.out.println("Roll No: "+roll+"  Name :"+name+"  Marks :"+marks);

	}	
	public static void main(String args[])
	{
		Students S = new Students(101, "Abhijeet", 51);
		S.Display();
	}
}