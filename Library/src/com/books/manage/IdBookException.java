package com.books.manage;

public class IdBookException extends RuntimeException{
public IdBookException() {
	System.out.println("Current Book id is not present in library");
	return ;
}
}
