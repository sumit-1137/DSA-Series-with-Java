package DSA;

import java.util.*;
public class SwitchCase {
	
	public static void main(String argc []) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Choose  the Fruit\n1.Apple\n2.Mango\n3.Orange\n4.Grapes\n5.Banana\n6.Exits\nEnter the Number :");
			int Fruit = sc.nextInt();
		if(Fruit == 1 ||Fruit == 2 ||Fruit == 3 ||Fruit == 3 ||Fruit == 4 ||Fruit == 5 ) {
			
	    switch (Fruit) {
		case 1 -> System.out.println("Apple Price : $250/kg ");
		case 2 -> System.out.println("Mango Price : $200/kg ");
		case 3 -> System.out.println("Orange Price : $150/kg ");
		case 4 -> System.out.println("Grapes Price : $100/kg ");
		case 5 -> System.out.println("Banana Price : $120/kg ");
		default -> System.out.println("Choose Valid Number ...!");
		}
		;
	   }
		else if(Fruit == 6 ){
			System.out.println("Done..!");
			break;
		}
		else {
			System.out.println("Invalid Input ");
		}
		
	 }
		
	}

}
