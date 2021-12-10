import java.lang.*;
public class Singel_Task_Example_Three extends Thread
{
	public void run()
	{
		System.out.println("Single task from single thread");
	}
	public static void main(String[] args)
	{
		Singel_Task_Example_Three e = new Singel_Task_Example_Three();
		e.start();

	}

}
