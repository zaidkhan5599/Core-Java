/*Assignment:
WAP to show how to access
1) static member inside static context
2) static member inside non-static context
3)non-static member inside non-static context
4) non-static member inside static context*/
package com.nonstatic;

public class Access {
	static int x=10;
	int y;
	void access(int y) {
		this.y=y;//using this
		System.out.println(this.y);
		System.out.println(x);
		System.out.println(this.x);
		y=320;// direct access
		System.out.println(y);
	}
	static void access() {
		System.out.println(x);
		System.out.println(Access.x);
		
	}
	public static void main(String[] args) {
		System.out.println(x);//static from static
		System.out.println(Access.x);// class name
		System.out.println("************");
		Access a=new Access();
		System.out.println(a.y);//using Object
		a.access(30);
		System.out.println("________________");
		access();
		
		
		
		
	}

}
