import java.lang.*;
public class Example_Two implements Runnable
{
		public void run()
		{
			System.out.println("Start me using runnable");
		}
	public static void main(String[] args) 
	{
		Example_Two to = new Example_Two();
		Thread th = new Thread(to);
		th.start();

	}

}
