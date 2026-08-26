package OOP.inheritance;

class Box {
	 float length ;;
	float hight ;
	float width;
	
	Box(){
		this.length = length;
		this.hight = hight;
		this.width= width;
		
	}
	
	// cube 
	
	Box(float side){
		this.length = side;
		this.hight = side;
		this.width= side;
		
	}

	//all l w h
	public Box(float length, float hight, float width) {
		
		this.length = length;
		this.hight = hight;
		this.width = width;
	}
}
	
	/*
	 * public void information() { System.out.println("Higth :"+ this.hight
	 * +"\n Width :"+this.width+"\nLength : "+this.length); }
	 */
	
class BoxWeight extends Box{
	
	float weight;
	
	BoxWeight(){
		this.weight = weight;
	}
	
	BoxWeight(float hight,float width,float length,float weight){
		super(hight, width,length);
		this.weight = weight;
	}
		
}

public class BoxExample {
	public static void main(String[] args) {
		
		System.out.println("\nBy Default Constructor ");
		Box b1 = new Box();
		System.out.println(b1.hight +" "+ b1.length + " "+b1.width );
		
		System.out.println("\nBy Single Aurgument  Constructor");
		Box b2 = new Box(4);
		System.out.println(b2.hight +" "+ b2.length + " "+b2.width );
		
		System.out.println("\nBy Three Aurgument Constructor ");
		Box b3 = new Box(8,8,8);
		System.out.println(b3.hight +" "+ b3.length + " "+b3.width );
		
		
		System.out.println("\nUSING SINGLE INHERITANCE  ");
		BoxWeight BW = new BoxWeight(5,5,8,6);
		System.out.println(BW.hight +" "+ BW.length + " "+BW.width+ " "+BW.weight );
		
	}
}

	


