package com.books.manage;

import java.util.HashMap;
import java.util.Scanner;

public class BooksManagement {
	Scanner sc=new Scanner(System.in);
	Category c=new Category();
	public Books insert(Books b) {
		
		System.out.println("Enter the book details ");
		System.out.println("Enter book id :");
		String id=sc.nextLine();
		b.setBookid(id);
		//Category.updateInsert(b.getBookid());
		System.out.println("Enter book name :");
		String name=sc.nextLine();
		b.setBookname(name);
		System.out.println("Enter book autor name :");
		String author=sc.nextLine();
		b.setAuthor(author);
		System.out.println("Enter book category :");
		String category=sc.nextLine();
		b.setCategory(category);
		
		return b;
	}
	
	 void search(HashMap<String, Books> books,String i) {
		if(books.containsKey(i)) {
		System.out.println(books.get(i));
		}else {
//			System.out.println("Current book is not present");
			try {
			throw new IdBookException();
			}catch(IdBookException e) {
			}
		}
	}
	void removebook(HashMap<String, Books> books,String i) {
		if(books.containsKey(i)) {
		System.out.println("Book deleted !!!\n");
		Category.updateCategory(books.remove(i));
		}
		else {
			System.out.println("Book is not present to be deleted!!!");
		}
		}
	void updateSize(HashMap<String, Books> books) {
		if(books.isEmpty()) {
			try {
			throw new BookNotFound();
			}catch(BookNotFound e) {
				System.out.println("No Books!!!");
			}
		}
		else {
		System.out.println("Total books present in the library are :"+books.size());
		}
		
	}
	
	
}

