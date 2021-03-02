package com.ltts;

public class Constructor {
	Constructor()
	{
		System.out.println("default constructor");
	}
	Constructor(int a)
	{
		System.out.println("parameterised constructor");
	}

public static void main(String[] args) {
	Constructor t=new Constructor();
	Constructor t1=new Constructor(10);
	
}
}