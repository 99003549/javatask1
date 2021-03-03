package com.ltts;

class Parent                                                                                                                                                                                                                                                                                          
{
	void displayInfo()
	{
		System.out.println("parent class method");
	}
	void showInfo()
	{
		System.out.println("Another parent class method");
	}
}

class Child extends Parent
{
	void getInfo()
	{
		System.out.println("child class methos");
	}
}
public class Demoinheritance {
public static void main(String[] args) {
	Child c=new Child();
	c.displayInfo();//method of parent
	c.showInfo();
	c.getInfo();//method of child
}
}
