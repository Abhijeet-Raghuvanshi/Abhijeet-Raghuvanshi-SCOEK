class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Threading is running..........");
	}
}
public class Mythread
{
	public static void main(String[] args)
	{
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
	}
}