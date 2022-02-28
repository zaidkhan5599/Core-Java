package com.nonstatic;

public class Company {
	
	public static void main(String[] args) {
		Employee e=new Employee("Zaid Khan",25000);
		System.out.println(e.id+" "+e.name+" "+e.sal);
		Employee e1=new Employee("Vivek Yadav",25000);
		System.out.println(e1.id+" "+e1.name+" "+e1.sal);
		Employee e3=new Employee("Bharat",20000);
		System.out.println(e3.id+" "+e3.name+" "+e3.sal);
		System.out.println(new Employee().id+" "+new Employee().name+" "+new Employee().sal);
	}

}
