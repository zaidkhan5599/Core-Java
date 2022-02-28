package com.oi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		String path="C:/Users/ACER/Desktop/CapgFile/Demo.txt";
		File file=new File(path);
		FileReader r=new FileReader(file);
		BufferedReader br=new BufferedReader(r);
		
		String s=br.readLine();
		s=br.readLine();

		System.out.println(s);
//		
//		int a=r.read();
//		while(a!=-1) {
//			System.out.print((char)a);
//			a=r.read();
//		}
//		
		r.close();
	}

}
