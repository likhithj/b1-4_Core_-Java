package day12;

public class example1 extends Thread 
	{
		public void run()
		{
			System.out.println("thread is running");
		}
		public static void main(String[] args) {
			{
				example1 e=new example1();
				e.start();
			}

	}

}
