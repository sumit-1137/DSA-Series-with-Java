package OOP;


public class PackagesDemo2 {
	
	void WelcomeByPackage() {
		System.out.println("Welcome in java Programing ...");
	}
	public static void main(String[] args) {
		
		PackagesDemo2 obj = new PackagesDemo2();
		obj.WelcomeByPackage(); //package OOP method of PackagesDemo2
		
		PackagesDemo1 obj1 =new PackagesDemo1();
		obj1.greetByPackage();  //package OOP method of PackagesDemo1
		
		Human h2 = new Human(35,"Ram",true); //from human class 
		System.out.println(h2.age +" | "+h2.name+" | "+h2.is_married); 
		
		
		
	}

}
