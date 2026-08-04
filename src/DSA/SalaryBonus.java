package DSA;

import java. util.*;


public class SalaryBonus {
	public static void main(String argc[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ur Salary :");
		int sal = in.nextInt();
		
		if (sal >=10000 && sal<=29999) {
			sal = sal +2000;
			System.out.println("Salary + Bonus = "+sal);
		}
		else if(sal <=9999) {
			sal = sal +1000;
			System.out.println("Salary + Bonus = "+sal);
			
		}
		else {
			sal = sal +3000;
			System.out.println("Salary + Bonus = "+sal);
			
		}
	}

}
