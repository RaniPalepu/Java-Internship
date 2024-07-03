package com.pace.library.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.pace.library.entity.Book;
import com.pace.library.presentation.BookServiceProvider;

public class BookUI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Book book = new Book();
		ArrayList <Book> bookList = new ArrayList <Book>();
		
		BookServiceProvider bookServiceProvider = new BookServiceProvider();
		Scanner scnr = new Scanner(System.in);
		int choice;
	
		while (true) {
			System.out.println(
			"1. Add Book Details 2. Show Book Details 3. Delete Book 4. Update Book 5. Exit\n");
			System.out.println("Enter your choice");
			choice = scnr.nextInt();
			scnr.nextInt();
			
			switch(choice) {
				case 1:
				book = null;
				book = new Book();
				System.out.println("Enter book id, name, author, price");
				book.setBookId(scnr.nextInt());
				scnr.nextInt();
				book.setBname(scnr.nextLine());
				book.setAuthor(scnr.nextLine());
				book.setPrice(scnr.nextFloat());
				scnr.nextLine();
				
				bookServiceProvider.insertBookService(book);
				break;
			case 2:
				//1.get books
				bookList = bookServiceProvider.getBookService();
				System.out.println("No. of rows in the table = " + bookList);
				//2.show books
				bookServiceProvider.showBooksService(bookList);
				break;
			case 3:
				System.out.println("Enter the book id:");
				int id = scnr.nextInt();
				scnr.nextLine();
				bookServiceProvider.deleteBookService(id);
				break;
			case 4:
				System.out.println("Enter the book id");
				int bid=scnr.nextInt();
				scnr.nextLine();
				bookServiceProvider.updateBookService(bid);
				break;
			case 5:
				System.out.println("Thank you for using our application");
				System.exit(0);//to terminate the application
				break;
				
			}
			}
		
		}
		
		}