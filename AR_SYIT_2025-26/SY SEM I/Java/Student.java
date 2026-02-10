public class Student
{
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks)
	{
		roll = roll;
		name = name;
		marks = marks;

		System.out.println("Roll No: "+roll+"  Name :"+name+"  Marks :"+marks);
	}
	
	public static void main(String args[])
	{
		Student S = new Student(101, "Abhijeet", 51);
	}
}