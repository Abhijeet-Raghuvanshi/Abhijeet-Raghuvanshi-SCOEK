public class Student51
{ 
	int isub1;
	int isub2;
	int isub3;

	//public Student51()
	//{
		
	//}

}

class Sem1 extends Student51
{
	void Sem1_display(int imath, int ichem, int icfp)
	{
		isub1 = imath;
		isub2 = ichem;
		isub3 = icfp;

		System.out.println("--------Marks in semester 1--------");
		System.out.println("Math : " +imath);
		System.out.println("Chem : " +ichem);
		System.out.println("CFP : " +icfp);
	}


}

class Sem2 extends Student51
{
	void Sem2_display(int iDisMath, int iphy, int iDSA)
	{
		isub1 = iDisMath;
		isub2 = iphy;
		isub3 = iDSA;

		System.out.println("--------Marks in semester 2--------");
		System.out.println("Discrete Math : " +iDisMath);
		System.out.println("Phy : " +iphy);
		System.out.println("DSA : " +iDSA);
	}
}

class Marks1
{
	public static void main(String args[])
{
	Sem2 s2 = new Sem2();
	s2.Sem2_display(65, 55, 41);
	s2.Sem1_display(71, 54, 85);
}
}

