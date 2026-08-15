package problemSolving;

import java.util.Scanner;

class fibNumber{
	
	public int checkNum(int num) {
		if(num == 0) {
			return 0;
		}
		if(num == 1){
			return 1;
		}
		
		int firstTerm =0;
		int secondTerm = 1;
		
		for(int i =1; i<=num;i++) {
			int thirdTerm = firstTerm +secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;		
			
		}
		return firstTerm;
	}
	
}
public class fibonacciNumber1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		fibNumber fib = new fibNumber();
		
		System.out.print("Enter The num to Check fibonacci Number:");
		int x = sc.nextInt();
		int ans = fib.checkNum(x);
		System.out.println( ans);
	
		
	}

}
