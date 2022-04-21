package com.tns.generics;

public class Genericmethod 
{
	public static<E>void print(E[]elements)
	{
		for(E itr: elements)
		{
			System.out.println(itr);
		}
	
	}

	public static void main(String[] args) {
		Integer[] arr = {11,22,33};
		Character[] arr1 = {'w','d','2'};
		print(arr);
		print(arr1);

	}

}
