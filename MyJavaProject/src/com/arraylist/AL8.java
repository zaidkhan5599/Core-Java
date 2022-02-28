package com.arraylist;
import java.util.ArrayList;
public class AL8 {
	public static void main(String[] args) {
		ArrayList<Boolean> ls=new ArrayList<>();
		ls.add(10==100);
		ls.add(20>10);
		ls.add(30!=10);
		ls.add(true && false);
		for(Boolean i:ls) {
			System.out.println(i);
		}
	}
}
