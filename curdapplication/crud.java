package com.ltts.Demojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class crud {
	public static void main(String[] args) {
		int ch;
		System.out.println("----Welcome to the CRUD application----");
		crud objTest=new crud();
		do
		{
			System.out.println("----MENU----");
			System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \n5.exit");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("----Create----");
						objTest.create_data();
			 			break;
				case 2: System.out.println("----Read----");
						objTest.read_data();
			 			break;
				case 3: System.out.println("----Update----");
						objTest.update_data();
			 			break;
				case 4: System.out.println("----Delete----");
						objTest.delete_data();
			 			break;
				case 5: System.out.println("----Exiting----");
						break;
				default: System.out.println("Invalid choice!!!");
						 System.out.println("Please renter your choice");
					
		    }
		}while(ch!=5);
	}

	public void create_data(){
		int sl_no;
		String name = null;
		String email = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		sl_no=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the email:");
		email=sc.next();
		Database_Connection obj_Database_Connection=new Database_Connection();
		Connection connection=obj_Database_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="insert into user(sl_no,name,email) values (?,?,?)";
			ps=connection.prepareStatement(query);
			ps.setLong(1, sl_no);
			ps.setString(2, name);
			ps.setString(3, email);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void read_data(){
		int sl_no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to read:");
		sl_no=sc.nextInt();
		Database_Connection obj_Database_Connection=new Database_Connection();
		Connection connection=obj_Database_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String query="select * from user";
			ps=connection.prepareStatement(query);
			//ps.setLong(1, sl_no);
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
			System.out.println("Sl no: "+rs.getInt("sl_no"));
			System.out.println("Name:"+rs.getString("name"));
			System.out.println("Email: -"+rs.getString("email"));
			System.out.println("---------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update_data(){
		int sl_no = 0;
		int new_sl_no = 0;
		String name = null;
		String email = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the old id:");
		sl_no=sc.nextInt();
		System.out.println("Enter the new id:");
		new_sl_no=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the email:");
		email=sc.next();
		Database_Connection obj_Database_Connection=new Database_Connection();
		Connection connection=obj_Database_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="update user set sl_no=?,name=?,email=? where sl_no=?";
			ps=connection.prepareStatement(query);
			ps.setLong(1, new_sl_no);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setLong(4, sl_no);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void delete_data(){
		int sl_no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete:");
		sl_no=sc.nextInt();
		Database_Connection obj_Database_Connection=new Database_Connection();
		Connection connection=obj_Database_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="delete from user where sl_no=?";
			ps=connection.prepareStatement(query);
			ps.setLong(1, sl_no);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}


