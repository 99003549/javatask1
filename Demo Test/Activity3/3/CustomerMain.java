package com.ltts;

import java.util.Scanner;

public class CustomerMain {
	
	public static void main(String[] args) {
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details:");
		String name=sc.next();
		
		String[] arrOfStr = name.split(","); 
		c.setName(arrOfStr[0]);
		c.setAddress(arrOfStr[1]);
		c.setMobile(arrOfStr[2]);
		
		System.out.println("Name: "+c.getName());
		System.out.println("Address: "+c.getAddress());
		System.out.println("Mobile: "+c.getMobile());
		
		
		
		
		
		

}
}

