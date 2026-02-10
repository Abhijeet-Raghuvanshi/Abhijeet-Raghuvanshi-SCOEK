class MyRunnable implements Runnable
{
	public void run()
	{
		for(int le = 1; le <= 100; le++)
		{
			try 
			{
				Thread.sleep(10);
				System.out.println(le);
			}

			catch(InterruptedException e)
			{
				System.out.println("Thread was interuppted");
			}
		}
	}
}
public class MainThread
{
	public static void main(String[] args)
	{
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
	}
}