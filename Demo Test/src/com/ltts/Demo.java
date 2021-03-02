package com.ltts;



public class Demo 
{//class open
	int a=10;//data member 1 or property(instance variable)
	int b=20;//data member 2 (instance variable)
	static int c=15;
	void displayInfo()//normal method
	{
		int a=100,b=200;//higher priority only for local variables
		System.out.println(a + b);
		System.out.println(c);
		c++;
		System.out.println(c);
	}
	/*void showInfo()
	{
		System.out.println("show info method");
	}*/
	
	
public static void main(String[] args)//main method
{
	Demo d=new Demo();//here d is called as object
	Demo D1=new Demo();//here D1 is called object
	d.displayInfo();//30
	//d.showInfo();
	//System.out.println(c);
	//c++;
	//System.out.println(c);
	D1.displayInfo();//150
	//D1.showInfo();
}

}//ended
