public class Multi implements Runnable
{
	public void run()
	{
		for(int le = 0; le < 3; le++)
		{
			System.out.println("Thread name "+Thread.currentThread().getName()+" is Running "+le);
		}

		public static void main(String args[])
		{
			Multi multi = new Multi();

			Thread thread1 = new Thread(n, "IT");
			Thread thread2 = new Thread(n, "CS");
			Thread thread3 = new Thread(n, "ECE");

			thread1.start();
			thread2.start();
			thread3.start();
		}
	}
}