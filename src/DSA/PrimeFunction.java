package DSA;

import java.util.*;

public class PrimeFunction {
	public static void main(String argc[]) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		boolean ans = is_prime();
		System.out.println("Answer : "+ans);
		
	}
	static boolean is_prime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num to check : ");
		int n = sc.nextInt();
		if(n<=1) {
			return false;
			
		}
		
		int c = 2;
		while(c*c <=n) {
		if( n % c  ==0) {
			return false;
		}
		c++;
		}
		return c * c > n;
		
		
	}

}
