package com.ltts;

import java.util.Scanner;

public class Employee2Main {
	
public static void main(String[] args) {
	Employee e=new Employee();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name:");
	String name=s.next();
	System.out.println("Enter Address:");
	String addr=s.next();
	System.out.println("Enter Mobile:");
	String mob=s.next();
	e.setName(name);
    e.setAddress(addr);
	e.setMobile(mob);
	System.out.println("Employee Details\n" +"Enter the Name: "+e.getName()+"\nEnter Address: "+e.getAddress()+"\nEnter Mobile: "+e.getMobile());
	System.out.println("Verify and update details");
	System.out.println("Menu:\n1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit" );

	Scanner num=new Scanner(System.in);
	int number=num.nextInt();
	
	switch(number)
	{
	case 1:
		System.out.println("current name is:" +e.getName());
		System.out.println("Enter the name");
		String nam=s.next();
		e.setName(nam);
		System.out.println(e.getName());
	case 2:
		System.out.println("current address is:" +e.getAddress());
		System.out.println("Enter the Address");
		String add=s.next();
		e.setAddress(add);
		System.out.println(e.getAddress());
	case 3:
		System.out.println("current mobile is:" +e.getMobile());
		System.out.println("Enter the Mobile");
		String mobile=s.next();
		e.setMobile(mobile);
		System.out.println(e.getMobile());
	case 4:
		System.out.println("The details are:");
		System.out.println(" Name: "+e.getName()+"\nAddress: "+e.getAddress()+"\nMobile: "+e.getMobile());
		
	}
}



	
}


