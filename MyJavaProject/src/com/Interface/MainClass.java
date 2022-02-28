package com.Interface;

public class MainClass {
	public static void main(String[] args) {
		Shape s=new Circle(2);
		System.out.println("Area of Circle is "+s.area());
		Shape s1=new Rectangle(10,2);
		System.out.println("Area of rectangle is "+s1.area());
		Shape s2=new Square(5);
		System.out.println("Area of square is "+s2.area());
		Shape s3=new RightAngledTriangle(3, 2);
		System.out.println("Area of Right Angled Triangle is "+s3.area());
		Shape s4=new Cylinder(3,5);
		System.out.println("Area of Cylinder is "+s4.area());
		Shape s5=new Cone(3,6);
		System.out.println("Area of Cone is "+s5.area());
		
	}
}
