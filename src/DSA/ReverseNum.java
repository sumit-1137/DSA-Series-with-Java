package DSA;

import java.util.*;
public class ReverseNum {
	public static void main(String argc []) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter The number to Reverse :");
	int n  = sc.nextInt();
	
	int ans =0;
	while(n>0) {
		int rem = n % 10;
		n = n/10;
		
		ans = ans * 10 + rem;
	
	}
	System.out.println("Reverse Number is :"+ans);
	
}
}
