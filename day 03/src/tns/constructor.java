package tns;

public class constructor 
{
	String str;
	int a;
	constructor(String str,int a)
	{
		this.str=str;
		this.a=a;
	}
	
    void display()
	{
		System.out.println(str+" "+a);
	}

	 public static void main(String[] args) 
	{
	     constructor c=new constructor("virat",18);
		 c.display();
	}
}


