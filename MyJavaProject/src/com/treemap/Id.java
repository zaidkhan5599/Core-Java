package com.treemap;

public class Id implements Comparable<Id>{

int id;
Id(){
	
}
@Override
public int compareTo(Id o) {
	return this.id-o.id;
}
Id(int id){
	this.id=id;
}
public String toString() {
	return ""+id;
}
}