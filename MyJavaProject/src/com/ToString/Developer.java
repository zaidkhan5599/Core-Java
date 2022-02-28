package com.ToString;

public class Developer extends Employee{
	String lang;
	
	public Developer(String name,int id,double sal,String lang) {
		super(name,id,sal);
		this.lang = lang;
	}
	public String toString() {
		return super.toString()+" language is :"+lang;
	}
	public boolean equals(Object ob) {
		Developer d=(Developer)ob;
		return super.equals(d) && this.lang==d.lang;
	}
	public static void main(String[] args) {
			Employee e=new Employee("Zaid",1,25000);
			Developer d=new Developer("Khan",2,32000,"Java");
			Employee e1= new Developer("vivek",3,30000,"Python");
			System.out.println(e);
			System.out.println(d);
			System.out.println(e1);
			Developer d1=new Developer("vivek",3,30000,"Python");
			System.out.println(d.equals(d1));
	}

}
