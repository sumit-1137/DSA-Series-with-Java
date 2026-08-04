package DSA;
import java.util.*;
public class OverLoading {
	
	public static void main(String argc[]) {
		
		func("Sumit chavan");
		func(23);
	}
	static void func(String name) {
		System.out.println(name);
	}
	
	static void func(int roll) {
		System.out.println(roll);
	}

}
