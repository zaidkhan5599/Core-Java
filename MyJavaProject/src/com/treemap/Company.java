package com.treemap;

import java.util.TreeMap;

public class Company {

	public static void main(String[] args) {
		TreeMap<Id, Emp> employees=new TreeMap<>();
		Id id1=new Id(1);
		Id id2=new Id(2);
		Id id3=new Id(1);
		Emp e1=new Emp(id1,"Dinga",1000);
		Emp e2=new Emp(id2,"Dingu",2200);
		Emp e3=new Emp(id3,"Dingi",2200);
		employees.put(id1, e1);
		employees.put(id2, e2);
		employees.put(id3, e3);
		System.out.println(employees);
		Emp e = employees.get(id1);//retrieval
		e.name="Dinga Dingi";
		if(employees.containsKey(id3)) //search
		{
			employees.remove(id3);//deleted
			
		}
		System.out.println(employees);
	}

}
