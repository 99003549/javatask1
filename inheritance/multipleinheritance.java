package com.ltts;

class Parent1                                                                                                                                                                                                                                                                                          
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


interface Parent2                                                                                                                                                                                                                                                                                          
{
	void display();
	
}

class rehana extends Parent1 implements Parent2
{

	void getInfo()
	{
		System.out.println("multiple class method");
	}

   public void display()
	{
		System.out.println("interface");
	}
}
public class multipleinheritance {
public static void main(String[] args) {
	rehana c=new rehana();
	c.display();
	c.getInfo();
	c.showInfo();
	c.displayInfo();
}
}


