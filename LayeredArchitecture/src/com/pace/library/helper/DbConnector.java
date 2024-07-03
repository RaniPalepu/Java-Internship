package com.pace.library.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//HELPER class to handle DATACONNECTIVITY in MYSQL

public class DbConnector {
	
	//New instance of Connection
	private static Connection connection=null;
	
	//Opening connection with MYSQL database
	public static Connection createConnection()throws ClassNotFoundException, SQLException{
		String url,userId,passWord;
		url="jdbc:mysql://@localhost:3306/library";
		userId="root";
		passWord="Ravali@7809";
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,userId,passWord);
		return connection;
		
		
	}
	//closing connection
	public static void closeConnection()throws SQLException{
		connection.close();
	}
	

}
