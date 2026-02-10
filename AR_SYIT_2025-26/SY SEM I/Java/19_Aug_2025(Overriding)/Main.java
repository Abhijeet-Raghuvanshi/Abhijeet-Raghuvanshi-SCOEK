/**
	@file : 
	@brief : Demonstration of Method overriding in Java.
	@author : Abhijeet Raghuvanshi(raghuvanshiabhijeet6@gmail.com)
	@date : 19 Aug 2025
*/

class RBI
{
	public int ior()
	{
		return 7;
	}
}

class SBI extends RBI
{
	public int ior()
	{
		return 8;
	}	
}

public class Main
{
	public static void main(String args[])
	{
		SBI sbi = new SBI();

		sbi.ior();
		System.out.println("Rate of Interest = " +sbi.ior());
	}
}