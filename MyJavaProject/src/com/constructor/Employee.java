/*1)Write a program to create a class known as Employee 
  (having String id, String name, double salary as properties).
  Create a parameterized constructor and a non-parameterized 
  constructor.
  Generate id as CapG1 for first employee object.
  Use the concept of constructor chaining
 */
package com.constructor;

public class Employee {

	String name;
	String id;
	double salary;
	static int count;
	Employee(){
		count++;
		this.id="CapG"+count;
	}
	Employee(String name,double salary){
		this();//Consructor Chaining
		this.name=name;
		this.salary=salary;
	}

}
