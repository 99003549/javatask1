package com.ltts;

import java.util.Scanner;

public class TestEmployee {
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
}

}
