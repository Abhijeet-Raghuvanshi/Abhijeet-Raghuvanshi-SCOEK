class Employee
{
	int salary = 20000;
	void pf()
	{
		System.out.println("PF Facility");
	}
}

class Programmer extends Employee
{
	int bonus = 10000;
	void hi()
	{
		System.out.println("Health Insurance");
	}
}

class Tester extends Employee
{
	int bonus = 5000;
	void ti()
	{
		System.out.println("Term Insurance");
	}
}

class Hierarchical2
{
	public static void main(String args[])
	{
		Programmer p = new Programmer();
		Tester t = new Tester();

		int psalary = p.salary + p.bonus;
		int tsalary = t.salary + t.bonus;

		System.out.println("Programmer Salary Details and other : ");
		p.hi(psalary);
		p.pf();

		System.out.println("---------------------------------------");
		System.out.println("Tester Salary Details and Other : ");
		t.ti(tsalary);
		t.pf();

	}
}