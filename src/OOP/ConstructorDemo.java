package OOP;

class Student1{
	private int rno = 20;
	private String name = "sumit";
	private float marks = 50.5f;
	
	
	//parametries constuctor
	public Student1(int rno,String name,float marks) {
		this.rno = rno;
		this.name = name;
		this.marks = marks;
		
	}
	
	void studentDetails(){
		System.out.println("Roll no. :"+rno+"| Name :"+name +" | Marks :"+marks);
		
	}
	
	public void greet() {
		System.out.println("Hello "+ this.name);
	}
	
	/*
	 * void newName(String newName ) { name = newName; System.out.println(newName);
	 * }
	 */
}
public class ConstructorDemo {
	
	public static void main(String[] args) {
		Student1 student = new Student1(20,"Sumit",65.2f);
		student.studentDetails();
		//student.newName("Chavan");
		student.greet();
		
		
		
	}

}
