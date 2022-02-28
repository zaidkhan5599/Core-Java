package com.oi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		String path="C:/Users/ACER/Desktop/CapgFile/Demo.txt";
		File file=new File(path);
		
		FileWriter writer =new FileWriter(file);
		
		writer.write("This is Demo File");
		
		writer.close();
		
		System.out.println("File Written");
	}

}
