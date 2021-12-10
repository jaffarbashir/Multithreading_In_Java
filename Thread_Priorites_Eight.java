import java.lang.*;
class Thread_Priorites_Eight extends Thread 
{ 
	public void run()
	{
		System.out.println("Me");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	
	{   Thread.currentThread().setPriority(10);
		Thread_Priorites_Eight t = new Thread_Priorites_Eight();
		t.start();
		System.out.println(Thread.currentThread().getPriority());
	}

}
