package OOP;

class Pay {
	void display() {
		System.out.println("d");
	}
}

class Credit extends Pay{
	void display() {
		System.out.println("B");
	}
} 
public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		Pay p = new Credit();
		p.display() ; 
		
		Credit c = new Credit();
		c.display() ;
		
		Credit d = (Credit)new Pay();
		d.display() ;
	}

}
