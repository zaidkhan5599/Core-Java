package com.oi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path="C:/Users/ACER/Desktop/CapgFile/emp.ser";

		File file=new File(path);
		
		FileInputStream fin=new FileInputStream(file);
		
		ObjectInputStream out=new ObjectInputStream(fin);
		Object ob=out.readObject();
		try {
			
		while(ob!=null) {
			
			Employee emp=(Employee)ob;
		System.out.println(emp);
		ob=out.readObject();
		
		}
		}
		catch(Exception e) {
			//e.printStackTrace();
			if(ob!=null) {
				
			}
		}
out.close();
		
		fin.close();
		}
	
		
	}


