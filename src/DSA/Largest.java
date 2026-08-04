package DSA;
import java.util.*;

public class Largest {
	
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b && c<b ) {
			System.out.println("Largest B : "+b);
		}else if (a>b && a>c) {
			System.out.println("Largest A :"+a);
		}else {
			System.out.println("Largest C :"+c);
			
		}
		
	}

}
