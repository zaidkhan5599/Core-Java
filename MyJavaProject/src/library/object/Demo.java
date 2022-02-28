package library.object;

public class Demo {

	public static void main(String[] args) {
		Object ob1=new Object();
		Object ob2=new Object();
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.toString());
		String s1=ob2.toString();
		System.out.println(s1);
		int h1=ob1.hashCode();
		int h2=ob2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		
//		System.out.println(ob1.hashCode());
//		System.out.println(ob2.hashCode());
		Object ob3=ob2;
		boolean b1=ob3.equals(ob2);
		System.out.println(b1);
		boolean b2=ob1.equals(ob3);
		System.out.println(b2);
		System.out.println(ob3.equals(ob1));
		System.out.println(ob3.equals(ob2));
		
	}

}
