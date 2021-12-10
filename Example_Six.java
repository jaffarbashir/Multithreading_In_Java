
public class Example_Six extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hii");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello world");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Jaffar");
		System.out.println(Thread.currentThread().getName());
		Example_Six s = new Example_Six();
		s.start();

	}

}
