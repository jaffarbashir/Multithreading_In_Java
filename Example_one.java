import java.lang.*;
public class Example_one extends Thread
{
	public void run()
	{
		System.out.println("Start me");
	}
public static void main(String [] args)
{
	Example_one oe = new Example_one();
	oe.start();
}
}
