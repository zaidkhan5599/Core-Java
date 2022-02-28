package com.books.manage;

import java.util.Arrays;

public class Category {
	static String categoryid[]= {"10071","10072","10073","10074","10075"};
	static public String categories[]= {"Magazines","Sports","Educational","Fictions","Comics"};
	static public int bookcount[]= new int[5];
	static void category(String category) {
		for(int i=0;i<categories.length;i++) {
			if(category.equals(categoryid[i])) {
				bookcount[i]++;
				System.out.println(bookcount[i]);
			}
		}
	}
	static void catgdisplay(String category) {
		category(category);
	}
	static void totalCategoriesOfBooks() {
		for(int i=0;i<categories.length;i++)
			System.out.println("Total books are "+bookcount[i]+" and category is "+categories[i]+" ");
	}
	static void updateCategory(Books b1) {
		for(int i=0;i<categoryid.length;i++) {
			if(b1.getCategory().equals(categoryid[i])) {
				bookcount[i]--;
			}
		}

	}
	
	@Override
	public String toString() {
		return "Category [categoryid=" + Arrays.toString(categoryid) + ", categories=" + Arrays.toString(categories)
		+ ", bookcount=" + Arrays.toString(bookcount) + "]";
	}


}
