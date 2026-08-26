package OOP.inheritance;


class ShapeOne{
	
	static void welCome() {
		System.out.println("Hello , Welcome in OOP");
	}
	void info() {
		System.out.println("This is Shape class method ");
	}
}


class Circle extends ShapeOne{
	
	void info() {
		System.out.println("This is Circle class method ");
	}
}

class Square extends ShapeOne{
	
	void info() {
		System.out.println("This is Square  class method ");
	}
}


class Tringle  extends ShapeOne{
	
	void info() {
		System.out.println("This is Tringle  class method ");
	}
	
	

}
public class ShapeExample {
	
	public static void main(String[] args) {
		
		ShapeOne shape = new ShapeOne();
		shape.info();
		
		Circle c1 = new Circle();
		c1.info();
		
		ShapeOne c2 = new Circle();
		c2.info();
		
		
		Square s1 =  new Square();
		s1.info();
		
		
		c2.welCome();
		
	}

}
