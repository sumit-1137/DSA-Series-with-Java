package DSA;

import java.util.*;

public class Calculator {
	public static void main(String argc[]) {
		
		Scanner sc = new Scanner(System.in);
		
		float ans = 0;
		
		while(true ) {
			System.out.print("Enter the operator :");
			char op = sc.next().trim().charAt(0);
			
			
			if(op == '+'  ||op == '-' ||op == '*' ||op == '/' ||op == '%' ) {
				
				System.out.print("Enter Num1 :");
				int num1 = sc.nextInt();
				
				System.out.print("Enter Num2 :");
				int num2 = sc.nextInt();
				
				if(op == '+') {
					ans = num1 +num2 ;
				}
				if(op == '-') {
					ans = num1 - num2 ;
				}
				if(op == '*') {
					ans = num1 * num2 ;
				}
				if(op == '/') {
					if(num2 != 0) {
					ans = num1/num2 ;
					}
				}
				if(op == '%') {
					ans = num1 % num2 ;
				}
			}
			else if (op =='x'|| op =='X') {
				System.out.println("Calculation Done ..!");
				break;
				
			}
			else {
				System.out.println("Invalid Input ");
				
			}
		System.out.println("ans :"+ans);	
		}
		
	}

}
