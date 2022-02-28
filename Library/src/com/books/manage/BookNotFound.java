package com.books.manage;

public class BookNotFound extends RuntimeException{
	public BookNotFound() {
		System.out.println("Books are not present in the library ");
		
	}
}
