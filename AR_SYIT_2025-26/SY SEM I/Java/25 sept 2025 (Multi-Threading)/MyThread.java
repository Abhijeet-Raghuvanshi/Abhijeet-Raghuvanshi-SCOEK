public class MyThread
{
	public void run()
	{
		Sytem.out.println("Thread - MyThread is Running...");
	}

	public static void main(String args[])
	{
		MyThread newThread = new MyThread();
		newThread.start();
	}
}