package com.prac;

interface lambdaa{
	void msg();
}
class lam implements lambdaa{

	@Override
	public void msg() {
		System.out.println("Hello ");
	}
	
}
public class Lambda {

	public static void main(String[] args) {
		lambdaa l1=()->{
			System.out.println("Hii");
		};
//		lam l=new lam();
		l1.msg();
		
	}

}
