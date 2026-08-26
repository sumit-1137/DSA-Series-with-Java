package OOP.inheritance;
class Base {
	int age ;
	String name ;
	
	void getDetails(int age ,String name ) {
		System.out.println("Age :"+age+"  | Name :"+name);
	}
}

class Subclass extends Base{
	void show() {
		System.out.println("age is "+age);
		System.out.println("Name is "+name);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		
		Base b = new Base();
		Subclass s = new Subclass();
		Base b1 = new Subclass();
		
		b.getDetails(10,"ram");
		s.getDetails(12, "Sham");
		b1.getDetails(20,"Sumit");
		s.show();
		
		
	}

}
