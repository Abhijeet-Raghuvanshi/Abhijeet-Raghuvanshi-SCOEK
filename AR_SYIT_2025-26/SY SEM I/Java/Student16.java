public class Student16
{
	int roll;
	String name;
	int marks;

	public	Student16()
	{
		
		roll = 51;
		name = "Abhijeet";
		marks = 59;
		System.out.println("Roll no : " +roll+ " Name : " +name+ " Marks : "+marks);
	}
	
	public Student16(int r)
	{
		roll = r;
		System.out.println("Roll no. :" +roll);
	}

	public Student16(int r, String n)
	{
		roll = r;
		name = n;
		System.out.println("Roll no. :" +roll+ " Name : " +name);

	}
	
	public Student16(int r, String n, int m)
	{
		roll = r;
		name = n;
		marks = m;
		System.out.println("Roll no. :" +roll+ " Name : " +name+ " Marks :" +marks);

	}

	public static void main(String[] args)
	{
		Student16 s1 = new Student16();
		Student16 s2 = new Student16(50);
		Student16 s3 = new Student16(52, "Shubham");
		Student16 s4 = new Student16(60, "Kshitij", 3);
	}
}