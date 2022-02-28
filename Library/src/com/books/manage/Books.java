package com.books.manage;

import java.util.Scanner;

public class Books implements Comparable<Books>{
	private String bookid;
	private String bookname;
	private String author;
	private String category;
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		if(bookid.equals("")) {
			System.out.println("Enter Book ID");
			Scanner sc=new Scanner(System.in);
			String bkid=sc.nextLine();
			setBookid(bkid);
		}else {
			this.bookid = bookid;
		}
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		if(bookname.equals("")) {
			System.out.println("Enter Book name");
			Scanner sc=new Scanner(System.in);
			String bkname=sc.nextLine();
			setBookname(bkname);
		}else {
			this.bookname = bookname;
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		if(author.equals("")) {
			System.out.println("Enter Auhtor name");
			Scanner sc=new Scanner(System.in);
			String bkauth=sc.nextLine();
			setAuthor(bkauth);
		}else {
		this.author = author;
		}
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		
		if(category.equals("10071") || category.equals("10072") || category.equals("10073") ||category.equals("10074") ||category.equals("10075"))
		this.category = category;
		else{
			System.out.println("Enter valid category\n10071\n10072\n110073\n10074\n10075");
			Scanner sc=new Scanner(System.in);
			String cat=sc.nextLine();
			setCategory(cat);
		}
		}
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", category=" + category
				+ "]";
	}
	@Override
	public int compareTo(Books o) {
		return this.category.compareTo(o.category);
	}
	
}
