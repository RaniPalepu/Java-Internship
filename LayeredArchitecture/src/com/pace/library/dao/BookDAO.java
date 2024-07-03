package com.pace.library.dao;

//DAO layer or persistence layer

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pace.library.entity.Book;
import com.pace.library.helper.DbConnector;
public class BookDAO {
	//JDBC API classes for data retrieval
	private Connection connection = null;
	private PreparedStatement Pstatement= null;
	private ResultSet resultset = null;
	
	//Book book = new Book();
	ArrayList<Book> bookList = null;
	private static String bookQry = "select * from book";
	
	/********Get Books Data********/
	
	public ArrayList<Book> getBooks() throws ClassNotFoundException, SQLException{
		//Process to get books from table into BookList;
		//Get the book data from table;
		//Add each book to BookList;
		//return BookList;
		try {
			//open the connection
			connection = DbConnector.createConnection();
			//create Pstatement
			Pstatement = connection.prepareStatement(bookQry);
			//get the result
			resultset = Pstatement.executeQuery();
			Book book;
			bookList = new ArrayList<Book>();
			while(resultset.next()) {
				int bookId;
				String bookName;
				String author;
				float price;
				//declare the pojo
				book = new Book();
				//get the row details
				bookId = resultset.getInt(1);
				bookName = resultset.getString(2);
				author = resultset.getString(3);
				price = resultset.getFloat(4);
				//Add this data to book bean
				//set the pojo with retrieved values from the row
				book.setBookId(bookId);
				book.setBname(bookName);
				book.setAuthor(author);
				book.setPrice(price);
				//Add the book to bookList
				bookList.add(book);
				book = null;
			}//end of while loop
		}catch (SQLException sqlex) {
			
		}finally {
			//close connection
			//now data is in array list object, close the connection
			DbConnector.closeConnection();
		}
		return bookList;
	}
		
		/********Show list of books*********/
	
	public void showBookList(ArrayList<Book> bookList2) {
		System.out.println("In DAO Layer");
		for(Book book : bookList2) {
			System.out.println(book.getBookId());
			System.out.println("\t"+book.getBname());
			System.out.println("\t"+book.getAuthor());
			System.out.println("\t"+book.getPrice());
		}
	}
	/*******inserting book details********/
	public void insertBookDetails(Book book) throws ClassNotFoundException, SQLException{

		connection = DbConnector.createConnection();

		String insQry = "insert into book values(?, ?, ?, ?)";

		Pstatement = connection.prepareStatement(insQry);

		Pstatement.setInt(1, book.getBookId());

		Pstatement.setString(2, book.getBname());

		Pstatement.setString(3, book.getAuthor());

		Pstatement.setFloat(4, book.getPrice());

		

		int rows = Pstatement.executeUpdate();

		System.out.println(rows + "Rows Inserted!");

		DbConnector.closeConnection();

	}

	/****deleting book*****/

	public boolean deleteBook(int id) throws SQLException, ClassNotFoundException{

		Pstatement = null;

		connection = DbConnector.createConnection();

		String delQry = "delete from book where id = ?";

		Pstatement = connection.prepareStatement(delQry);

		Pstatement.setInt(1, id);

		int rows = Pstatement.executeUpdate();

		boolean isDelete = true;

		if(rows != 0) {// if rows is non-zero, it is deleted

			isDelete = true;// status of deletion

		}else {

			isDelete = false;//status of deletion

		}

		DbConnector.closeConnection();

		return isDelete;

	}

	/*******updating book********/

	public boolean updateBook(int id) throws SQLException, ClassNotFoundException{

		Pstatement = null;

		connection = DbConnector.createConnection();

		String upQry = "update book set price = price + price * 0.10 where id = ?";
		Pstatement = null;
		Pstatement = connection.prepareStatement(upQry);

		Pstatement.setInt(1, id);

		int rows = Pstatement.executeUpdate();

		boolean isUpdate = true;

		if(rows != 0) {//if row available is deleted

			isUpdate = true;

		}else {

			isUpdate = false;

		}

		DbConnector.closeConnection();

		return isUpdate;

	}

	

	

}