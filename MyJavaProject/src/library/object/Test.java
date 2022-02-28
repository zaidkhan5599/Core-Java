package library.object;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Dinga", 17000);
		Employee emp1=new Employee(101,"Dinga", 17000);
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(emp.equals(emp1));
		Employee emp2=new Employee(102,"pinka",18000);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp.toString());
		System.out.println(emp2);
		System.out.println(emp1);

		
	}

}
