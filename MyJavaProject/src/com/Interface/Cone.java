package com.Interface;

public class Cone implements Shape{
double r;
double l;
public Cone(double r, double l) {
	super();
	this.r = r;
	this.l = l;
}
@Override
public double area() {
	return PI*r*(r+l);
} 

}
