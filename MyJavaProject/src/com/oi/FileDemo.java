package com.oi;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String path="C:/Users/ACER/Desktop/CapgFile/Demo.txt";
		File file=new File(path);
		file.createNewFile();
		System.out.println("File Created");
	}

}
