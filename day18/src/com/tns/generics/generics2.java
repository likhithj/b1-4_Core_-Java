package com.tns.generics;

import java.util.ArrayList;

public class generics2 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("likhith");
		a.add("vk");
		System.out.println(a);
		iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}
