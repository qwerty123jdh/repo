package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.beans.Book;

public class DemoBookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books= new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Adv Java", "Oracle", 2000d));
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		
	  books.stream().filter(book-> {return book.getPrice()>1200d;}).collect(Collectors.toList()).forEach(System.out::println);
	  System.out.println("new test");
      books.stream().filter(book-> {return book.getName().matches("hga");}).collect(Collectors.toList()).forEach(System.out::println);
	
      books.stream().filter(book-> {return book.getName().startsWith("Core");}).collect(Collectors.toList()).forEach(System.out::println);
	}
	

}
