package com.inheritance;

import java.util.Scanner;

public class Employee {
		String id;
		String name;
		double sal;
		static int count;
		{
			count++;
			this.id="CapG"+count;
		}
		Employee(){
			
		}
		Employee(String name,double sal){
			this();
			this.name=name;
			this.sal=sal;
		}
		Employee[] accept(int n) {
			Employee e[]=new Employee[n];
			for(int i=0;i<n;i++)
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter Salary");
				double sal=sc.nextDouble();
				e[i]=new Employee(name,sal);
			}
			return e;
		}
		void display(Employee[] e) {
			for(int i=0;i<e.length;i++) {
				System.out.println(e[i].id+" "+e[i].name+" "+e[i].sal);
			}
		}
	}


