package OOP;
import java.util.*;



public class BlockExample {
	final static int a  = 0;
	
	static {
		
		System.out.println("Static method ..");
	}
	
	{
		System.out.println("non Static Method");
	}
	
	public BlockExample() {
		System.out.println("Constroctor");
	}
	
	public static void main(String[] args) {
		BlockExample b1 = new BlockExample ();
	}

}
