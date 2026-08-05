package OOP;
import java.util.*;

public class OverloadingDemo {
	
	static void sum(int a,int b) {
		int ans = a + b;
		System.out.println("Addition of two numbers : "+ans);
	}
	
	static void sum(int a,int b,int c) {
		int ans = a + b +c;
		System.out.println("Addition of three numbers : "+ans);
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.Sum of 2 Num \n2.Sum of 3 Num\n3.Enter Your Choice :");
		int ch = sc.nextInt();
		if(ch ==1) {
			System.out.print("Enter Num :");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			sum(n1,n2);
			
		}
		else {
			System.out.print("Enter Num :");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
			sum(n1,n2,n3);
		}
		
	
		
	}
}
