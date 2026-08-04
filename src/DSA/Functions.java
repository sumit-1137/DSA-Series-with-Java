package DSA;

import java.util.*;

public class Functions {
	public static void main(String argc[]) {
//		Greet();
//		int ans = Sum(20,30);
//		System.out.println("Result : "+ans);
	String show = MyName();
	System.out.print(show);
		
	
		
		
	}
	
	/*
	 * static void Greet() { System.out.println("hello World...!"); }
	 */
	
	/*
	 * static int Sum() { Scanner sc = new Scanner(System.in);
	 * System.out.print("Enter num 1 :"); int num1 = sc.nextInt();
	 * 
	 * System.out.print("Enter num 2 :"); int num2 = sc.nextInt();
	 * 
	 * 
	 * int res = num1 + num2 ;
	 * 
	 * return res; }
	 */
	
	/*
	 * static int Sum(int a , int b ) { int sum = a+b;
	 * 
	 * return sum; }
	 */
	
	static String MyName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String x = sc.nextLine();
		
		String Greet = " Welcome "+x;
		return Greet;
	}

}
