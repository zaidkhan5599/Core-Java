package com.oi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerial {

	public static void main(String[] args) throws IOException {
		Employee emp=new Employee(101,"Dinga");
		Employee emp1=new Employee(102,"Dingi");

		String path="C:/Users/ACER/Desktop/CapgFile/emp.ser";
		
		File file=new File(path);
		
		FileOutputStream fout=new FileOutputStream(file);
		
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(emp);
		out.writeObject(emp1);
		System.out.println(" Object Serialized");
		out.close();
		fout.close();
		

	}

}
