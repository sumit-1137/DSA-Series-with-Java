package DSA;

import java.util.*;

public class ArmStrong {
	public static void main(String argc[]) {
//		boolean result = Is_Armstrong();
//		System.out.println(result);
//		
		for(int i = 0; i<1000;i++) {
			if(Is_Armstrong(i)) {
				System.out.print(i+" ");
			}
		}
	}

	
	static boolean Is_Armstrong(int n) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number : ");
//		int n = sc.nextInt();
		
		int original = n;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			n =n/10;
			sum = sum + rem*rem*rem;
		}
		return sum == original;
	}
}
