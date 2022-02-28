package com.hashcode;

public class Developer extends Employee{
	String lang;
	Developer(String name,int id,double sal,boolean stipend,String lang){
		super(name,id,sal,stipend);
		this.lang=lang;
	}
	public String toString() {
		return super.toString()+" Languauge is :"+lang;
	}
	public int hashCode() {
		int hc=super.hashCode()+lang.hashCode();
		return hc;
	}
	public static void main(String[] args) {
		Developer d=new Developer("A",1,30000,false,"Java");
		Developer d1=new Developer("A",1,30000,false,"Java");
		Employee e=new Employee("A",1,30000,false);
		Employee e1=new Employee("A",1,30000,false);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(d.equals(d1));
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e.equals(e1));
	}

}
