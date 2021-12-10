import java.lang.*;
public class Deamon_Example_Seven extends Thread
{
 public void run()
 {
	 if(Thread.currentThread().isDaemon())  
	 {
		 System.out.println("Yes I am a Daemon");
	 }
	 else
	 {
		 System.out.println(" I am a normal thread");
	 }
 }

public static void main(String [] args)
{
	System.out.println("Main method");
	Deamon_Example_Seven s = new Deamon_Example_Seven();
	s.setDaemon(true);
	s.start();
}
}
