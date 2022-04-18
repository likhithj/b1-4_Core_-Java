package tns.zzzz;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		try
		{
		int res=a/0;
		System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handeled");
		}
		finally
		{
			System.out.println("exception handling in java");
		}
		s.close();
		
	}

}
