package com.ltts;

import java.util.Scanner;

public class CompanyMain {
	
public static void main(String[] args) {
	Company c=new Company();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the company name:");
	String name=s.next();
	c.setName(name);
	
	System.out.println("Enter the Employees:");
	String emp=s.next();
	String[] arrOfStr = emp.split(",");
	c.setEmployees(emp);
	
	System.out.println("Enter Team Lead");
	String lead=s.next();
	c.setTeamlead(lead);
	
	System.out.println("Name: "+c.getName());
	System.out.println("Employees: "+c.getEmployees());
	System.out.println("Team Lead: "+c.getTeamlead());
	
	
	
	
}

}
