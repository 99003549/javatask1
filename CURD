package com.ltts;


import java.util.LinkedList;
import java.util.Scanner;

class Contacts
{
	static int noOfContacts=0;
	String firstName;
	String lastName;
	String phoneNumber;
	String emailId;
	//constructor
	public Contacts(String firstName, String lastName, String phoneNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	
	/******getter-setter start******/
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/******getter-setter end******/
	
	int createContact()
	{
		return(1);
	}
	int readContact()
	{
		return(1);
	}
	int updateContact()
	{
		return(1);
	}
	int deleteContact()
	{
		return(1);
	}
	
}

public class MainClass {
	static LinkedList<Contacts> l=new LinkedList<Contacts>();
	static Contacts c1=new Contacts(null,null,null,null);
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----Welcome to the CRUD apllication----");
		do
		{
			System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \n5.exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("----Create----");
						//firstname
						System.out.println("Enter first name:");
						c1.setFirstName(sc.next());
						//lastname
						System.out.println("Enter last name:");
						c1.setLastName(sc.next());
						//mobilenumber
						System.out.println("Enter phone number:");
						c1.setPhoneNumber(sc.next());
						//emailid
						System.out.println("Enter phone EmailId:");
						c1.setEmailId(sc.next());
						l.add(c1);
			 			break;
				case 2: System.out.println("----Read----");
						
			 			break;
				case 3: System.out.println("----Update----");
			 			break;
				case 4: System.out.println("----Delete----");
			 			break;
				case 5: System.out.println("----Exiting----");
						break;
				default: System.out.println("Invalid choice!!!");
					
		    }
		}while(ch!=5);
		
		
	}

}
