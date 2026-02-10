public class Employee
{
	int emp_id;
	String emp_name;
	int emp_sal;

	public Employee(int id, String name, int sal)
	{
		emp_id = id;
		emp_name = name;
		emp_sal = sal;

		System.out.println("Emp Id: " +id+" Name: "+name+ " Salary : "+sal);
	}

	public Employee(Employee obj)
	{
		emp_id = obj.emp_id;
		emp_name = obj.emp_name;
		emp_sal = obj.emp_sal;
		
		System.out.println("Emp Id: " +emp_id+" Name: "+emp_name+ " Salary : "+emp_sal);

	}


	public static void main(String args[])
	{
		Employee e = new Employee(101, "Abhijeet", 20000);
		Employee e1 = new Employee(e);
	}
}