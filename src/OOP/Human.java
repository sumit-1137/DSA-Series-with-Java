package OOP;

public class Human {
	
	int age ;
	String name;
	boolean is_married;
	
	static long population ; //static keyword 
	
	public Human(int age, String name, boolean is_married) {
		super();
		this.age = age;
		this.name = name;
		this.is_married = is_married;
		Human.population = population +1 ;//static 
	}
	
	//static method 
	static void greeting() {
		System.out.println("Welcome human ..!");
	}
	public static void main(String[] args) {
		Human h1 = new Human(20,"Sumit ",false);
		System.out.println(h1.age +" | "+h1.name+" | "+h1.is_married);
		
		greeting();
		System.out.println(h1.population);//before
		
		Human h2 = new Human(25,"Sham ",true);
		System.out.println(h2.population);
		
		System.out.println(h1.population); //after
		
		PackagesDemo1 obj1 =new PackagesDemo1();
		obj1.greetByPackage();  //package OOP method of PackagesDemo1D
		
		}

}
