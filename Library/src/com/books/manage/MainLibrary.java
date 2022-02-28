package com.books.manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MainLibrary {

	public static void main(String[] args) {
		BooksManagement bm=new BooksManagement();
		char ans;
		int choice;
		HashMap<String,Books> books=new HashMap<>();
		ArrayList<Books> ls=new ArrayList<>(); 
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("Welcome to Library ");
			System.out.println(" Press 1 to Insert a book \n Press 2 search a book \n "
					+ "Press 3 to delete a record \n press 4 to update a Books\n"
					+" Press 5 to sort by category id\n"
					+ " Press 6 to see different categories");
			choice=sc.nextInt();
			Books b1;
			switch(choice) {
			case 1:
				b1 = bm.insert(new Books());
					if(b1.getCategory()==null) {
						System.out.println("Please Enter the data correctly");
					}else {
						
						if(books.containsKey(b1.getBookid())) {
							System.out.println("Book Id Already exists");
						}
						else {
							Category.catgdisplay(b1.getCategory());
							books.put(b1.getBookid(), b1);
						}
					}
					System.out.println(books);
				break;
			case 2:
				System.out.println("Enter the id to be searched");
				String id=sc.next();
				bm.search(books,id);
				break;
			case 3:
				System.out.println("Enter the id to be removed ");
				String i=sc.next();
				bm.removebook(books, i);
				break;
			case 4:
				System.out.println("Total number of books are :");
				bm.updateSize(books);
				break;
			case 5:
				Iterator<Books> b = books.values().iterator();
				while(b.hasNext()) {
					ls.add(b.next());
				}
				Collections.sort(ls);
				System.out.println(ls);

				break;
			case 6:
				System.out.println("Total number of books are as follows :" );
				Category.totalCategoriesOfBooks();
				break;
			default:
				System.out.println("Please Enter correct choice");
			}		
			System.out.println("If you want to continue press 'y' or 'Y' ");
			ans=sc.next().charAt(0);
		}while(ans=='y' || ans=='Y');
	}
}


