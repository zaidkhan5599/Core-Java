package com.arraylist;

public class Developer extends Employee{
String lang;
Developer(){
	
}
public Developer(String name,int id,double stipend,String lang) {
	super(name,id,stipend);
	this.lang = lang;
}
public String toString() {
	return super.toString()+" "+"Language is :"+lang;
}

}
