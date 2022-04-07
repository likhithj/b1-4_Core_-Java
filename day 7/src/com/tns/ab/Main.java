package com.tns.ab;

public class Main {
	public static void main (String[] args) 
	{
		stat obj= new stat();
		obj.setdata(4,9);
		obj.showdata();
	}
}

class stat 
{
	int a;
	int b;
	public void setdata(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void showdata()
	{
		System.out.println("value of A ="+a);
		System.out.println("value of b ="+b);
	}
}

