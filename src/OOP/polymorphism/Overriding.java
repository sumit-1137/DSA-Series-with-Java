package OOP.polymorphism;

class Emp {
	
	int id;
	String name;
	double sal;
	
	public Emp(int id,String name,double sal) {
		this.id = id;
		this.name = name;
		this.sal=sal;
		
	}
	
	void info() {
		System.out.println(id+" | "+name+" | "+ sal);
	}
	
}

class Department extends Emp{
	String depName ;

	public Department(int id, String name, double sal ,String depName) {
		super(id, name, sal);
		this.depName=depName;
	
	}
	
	void info() {
		System.out.println(id+" | "+name+" | "+ sal +" | "+depName);
	}
	
	
}
public class Overriding {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "Sumit", 100000);
		e1.info();
		
		
		Department e2 = new Department(2,"Anand",20000, "Stock");
		e2.info();
		
		
		
	}

}
