package com.ltts.Demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database_Connection {
	public static void main(String[] args) {
		  Database_Connection obj_database_Connection=new Database_Connection();
		  System.out.println(obj_database_Connection.get_connection());
		}
	public Connection get_connection(){
		 Connection connection=null;
		try {
		  Class.forName("com.mysql.cj.jdbc.Driver");              
		  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapplication","root", "Psnumber@123");
		} catch (Exception e) {
		  System.out.println(e);
	}
		  return connection;
  }
}



