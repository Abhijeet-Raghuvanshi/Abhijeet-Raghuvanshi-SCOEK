/**
	@file : 
	@brief : Demonstration of Method overriding in Java.
	@author : Abhijeet Raghuvanshi(raghuvanshiabhijeet6@gmail.com)
	@date : 21 Aug 2025
*/

class RBI
{
	public int ior()
	{
		return 6;
	}
}

class BOB extends RBI
{
	public int ior()
	{
		return 9;
		
	}	

	void display()
	{
		System.out.println("Rate of Interest = " +super.ior());
		System.out.println("Rate of Interest = " +ior());
	}
}

public class Bank
{
	public static void main(String args[])
	{
		BOB bob = new BOB();

		bob.display();
		
	}
}