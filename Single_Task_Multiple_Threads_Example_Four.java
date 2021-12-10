import java.lang.*;
public class Single_Task_Multiple_Threads_Example_Four extends Thread
{
	public void run()
	{
		System.out.println("Task one completed.");
	}
	public static void main(String[] args)
	{
		Single_Task_Multiple_Threads_Example_Four e = new Single_Task_Multiple_Threads_Example_Four();
		e.start();
		Single_Task_Multiple_Threads_Example_Four f = new Single_Task_Multiple_Threads_Example_Four();
		f.start();
		
	}

}
