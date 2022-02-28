package com.constructor;

public class Company {

	public static void main(String[] args) {
			Employee e=new Employee("Zaid Khan",30000.00);
			System.out.println("Name is "+e.name+"\nId is "+e.id+"\nSalary is "+e.salary);

			Employee e1=new Employee("Vivek",25000.00);
			System.out.println("Name is "+e1.name+"\nId is "+e1.id+"\nSalary is "+e1.salary);
	}

}
