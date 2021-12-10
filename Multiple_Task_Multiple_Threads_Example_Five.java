import java.lang.*;
class Multi extends Thread
{
	public void run()
	{
		System.out.println("Task one.");
	}
}
 class Mul extends Thread
{
	public void run()
	{
		System.out.println("Task two.");
	}
}
public class Multiple_Task_Multiple_Threads_Example_Five extends Thread
{
	public static void main(String [] args)
	{
		Multi m = new Multi();
		Mul n = new Mul();
		n.start();
		m.start();
	}
}