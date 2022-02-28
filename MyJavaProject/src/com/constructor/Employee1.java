/*1) Write a program to create a class known as Employee 
   (having String id, String name, double salary as properties).
   Create a parameterized constructor.
   Generate id as CapG1 for first employee object.
*/
package com.constructor;
public class Employee1 {
	String id;
	String name;
	double sal;
	static int count;
	{
		count++;
		this.id="CapG"+count;
	}
	Employee1(){
		
	}
	Employee1(String name,double sal){
		this();
		this.name=name;
		this.sal=sal;
	}
}
