package com.constructor;

public class Company1 {

	public static void main(String[] args) {
		Employee1[] e=new Employee1[3];
		e[0]=new Employee1("Dinga",1000);
		e[1]=new Employee1("Dingi",2000);
		e[2]=new Employee1("Zinga",3000);
		for(int i=0;i<e.length;i++)
			System.out.println(e[i].id+" "+e[i].name+" "+e[i].sal);
	}
}
