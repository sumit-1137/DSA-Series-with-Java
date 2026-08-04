package DSA;

import java.util.Scanner;

public class Input {
	public static void main(String argc[]) {
		
		System.out.println("Enter Details ");
		Scanner sc = new Scanner(System.in);
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter Your Roll no. :"); int rollno = sc.nextInt();
		 * System.out.println("Roll Number is :"+rollno);
		 */
		int roll = sc.nextInt();
		System.out.println("Roll Number is :"+roll);
		
		float cgp = sc.nextFloat();
		System.out.println("cgp is :"+cgp);
		
		String div = sc.next();
		System.out.println(div);
		
		long mobile = sc.nextLong();
		System.out.println(mobile);
		
		
		double num = sc.nextDouble();
		System.out.println(num);
		
		
		
		
		

	}

}
