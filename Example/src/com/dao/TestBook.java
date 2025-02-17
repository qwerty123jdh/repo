package com.dao;

import java.util.List;
import java.util.Scanner;

import com.beans.Book;



public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter isbn");
		String isbn=s.next();
		System.out.println("enter book name");
		String name= s.next();
		System.out.println("enter book publication");
		String publication= s.next();
		System.out.println("enter author name");
		String author=s.next();
		Book book1= new Book(isbn,name,publication,author);
		Book book2= new Book();
		JDBCFunctionalities dao= new JDBCFunctionalities();
		String choice;
		
		System.out.println("select the options you want: (1) add book  (2) update book (3) display all books (4) find book by name  (5) find book by author name  (6) find book by isbn");
		int x=s.nextInt();
		do {
		if(x==1) {
			boolean rows1=dao.addBook(book1);
			boolean rows= dao.addBook(book2);
		}
		if (x==2) {
			System.out.println("enter isbn");
			String isbn1=s.next();
			System.out.println("enter book name");
			String name1= s.next();
			System.out.println("enter book publication");
			String publication1= s.next();
			System.out.println("enter author name");
			String author1=s.next();
			Book books= new Book(isbn1,name1,publication1,author1);
			int r=dao.updateBook(books, isbn1);
			if(r>0) {
				System.out.println("updated book");
			}
			else
				System.out.println("sorry no book found");
			
		}
		if (x==3)
		{
			List<Book> books= dao.findAllBooks();
			for(Book book:books)
			{
				System.out.println(book.getIsbn()+"  "+book.getName()+"  "+book.getPublication()+"  "+book.getAuthor());
			}

		}
		if(x==4)
		{
			System.out.println("enter book name");
			String name1= s.next();
			List<Book> books = dao.findBooksByName(name1);
			for(Book book:books)
			{
				System.out.println(book.getIsbn()+"  "+book.getName()+"  "+book.getPublication()+"  "+book.getAuthor());
			}
		}
		if(x==5)
		{
			System.out.println("enter author name");
			String author1=s.next();
			List<Book> books= dao.findBooksByAuthor(author1);
			for(Book book:books)
			{
				System.out.println(book.getIsbn()+"  "+book.getName()+"  "+book.getPublication()+"  "+book.getAuthor());
			}
		}
		
		if(x==6) {
			System.out.println("enter isbn");
			String isbn1=s.next();
			List<Book> books= dao.findBooksByAuthor(isbn1);
			for(Book book:books)
			{
				System.out.println(book.getIsbn()+"  "+book.getName()+"  "+book.getPublication()+"  "+book.getAuthor());
			}
		}
		System.out.println("do u want to continue y or n");
		 choice= s.next();
		}while(choice=="y");
		
		
		
		

	}

}
