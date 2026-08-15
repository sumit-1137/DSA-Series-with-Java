package problemSolving;

import java.util.Scanner;

class ChecKIsPalindrome{
	
	boolean  isPalindrome(int x) {
		
		
		if (x <0) {
			return false;
			
		}
		int orgNum = x;
		int revNum = 0;
		
		while(orgNum>0) {
			int rem = orgNum % 10;
			revNum = revNum *10 +rem;
			
			orgNum = orgNum/10;
		}
		
		if(revNum  == x) {
			
			return true;
		}else {
			return false;
		}
		
		
	}
}

public class isPalindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ChecKIsPalindrome num = new ChecKIsPalindrome();
		
		System.out.print("Enter The num to Check :");
		int x = sc.nextInt();
	
		boolean res = num.isPalindrome(x);
		System.out.println(res);
		if(res == true ) {
			System.out.println("Number is Palindrom");
		}else {
			System.out.println("Number is not Palindrom");
		}
		
		
	}

}
