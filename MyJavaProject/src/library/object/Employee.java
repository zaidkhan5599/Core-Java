package library.object;

public class Employee {
	int id;
	String name;
	double sal;
	Employee(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString() {
		return "id :"+id+" Name is :"+name+" Salary is :"+sal;
	}
	
	public int hashCode() {
		return id;
	}
	public boolean equals(Object ob) {
			Employee e=(Employee)ob;
			if(id==e.id)
				return true;
			else
				return false;
	}
}
