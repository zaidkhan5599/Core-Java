package com.inheritance3;

public class Vehicle {
	static int count;
	String vno;
	String name;
	Vehicle(){
		
	}
	{
		count++;
		this.vno="MH 12 "+count;
	}
	Vehicle(String name){
		this.name=name;
	}

}
