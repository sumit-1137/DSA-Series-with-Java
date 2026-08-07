package OOP;

class Emp{
	int emId = 1;
	String name = "ABS";
	long sal = 54514;
	
	Emp(){
		this.emId =emId;
		this.name=name;
		this.sal=sal;
	}
	
	
	//Emp e2 = new Emp(1,"sumit",54656);
	 Emp(int emId, String name, long sal) {
		super();
		this.emId = emId;
		this.name = name;
		this.sal = sal;
	}
	
	void empDetails() {
		System.out.println(emId);
		System.out.println(name);
		System.out.println(sal);
	}
	
	
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		
		Emp e1 = new Emp();
		e1.name ="sam";
		e1.sal =4556;
		e1.emId=2;
		
		e1.empDetails();
		
		System.out.println();
		Emp e2 = new Emp(1,"sumit",54656);
		e2.empDetails();
		
		
		
	}

}
