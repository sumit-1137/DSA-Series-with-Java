package OOP;

class Tree {
	static void colour() {
		System.out.println("Colour is Green");
	};
	
}
class Mango extends Tree{
	static void fruit_col() {
		System.out.println("Colour is Yellow");
	};
}




public class Simple_inheritance {
	public static void main(String[] args) {
		Tree.colour();
		Mango.colour();
		
		Mango.fruit_col();
		
	}
	
	

}
