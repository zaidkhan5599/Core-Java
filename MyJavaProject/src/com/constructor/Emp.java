package com.constructor;

public class Emp {

	private String name;
	private String id;
	 double sal;
	static int count;
	{
		count++;
		this.id="CapG"+count;
	}
	Emp(){
		
	}
	Emp(String name,double sal){
		this.name=name;
		setSal(sal);
	}
	void setName(String name) {
		this.name=name;
	}
	void setSal(double sal) {
		if(sal>15000) {
			this.sal=sal;
			}
			else {
				System.out.println("Invalid salary");
				setSal(Comp.sc.nextDouble());
			}
	}
	String getName() {
		return name;
	}
	String getId() {
		return id;
	}
	double getSal() {
		return sal;
	}
}
