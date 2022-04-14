package day12;

public class example2  extends Thread{
	public void run()
	{
		System.out.println("process error");
	}	
	public static void main (String args[])
	{
		example2 create= new example2();
		create.start();

	}

}
