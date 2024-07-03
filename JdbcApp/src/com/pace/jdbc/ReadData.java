package com.pace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class ReadData {
	Connection conn;
	Statement stmt;
	ResultSet rset;
	PreparedStatement pstmt;
	Scanner scnr=new Scanner(System.in);
	public void registerDriver() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	public void getDetails()throws Exception{
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Ravali@7809");
		
		stmt=conn.createStatement();
		//int row=stmt.executeUpdate("insert into book values(1006,'MyBook','Myself',563.24)");
		
		int id;
		String name,author;
		float price;
		
		System.out.println("Enter book id");
		id=scnr.nextInt();
		System.out.println("Enter book name");
		name=scnr.next();
		System.out.println("Enter book Author");
		author=scnr.next();
		System.out.println("Enter book price");
		price=scnr.nextFloat();
	    pstmt=conn.prepareStatement("insert into book values(?,?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, author);
		pstmt.setFloat(4,price);	
		pstmt.executeUpdate();
		
		
				
//		stmt=conn.createStatement();
//		int row2=stmt.executeUpdate(
//			"insert into book values("+id+",'"+name+"','"+author+"',"+price+")");
		rset=stmt.executeQuery("select * from book");
		
		while(rset.next()) {
			System.out.print(rset.getInt(1));
			System.out.print("\t"+rset.getString(2));
			System.out.print("\t"+rset.getString(3));
			System.out.println("\t"+rset.getFloat(4));
		}
		rset.close();
		stmt.close();
		conn.close();
	}
}
