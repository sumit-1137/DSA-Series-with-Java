package SearchingAlgorithms;
import java.util.*;

public class CheckForString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The name : ");
		String str = sc.nextLine() ;
		
		System.out.print("Enter char To Search : ");
		char target =sc.next().charAt(0);
		
	  boolean ans = search(str,target);
	  System.out.println(ans);
		
		
		
	}
	static boolean search(String x,char y) {
		for (int i = 0; i < x.length(); i++) {
			if(x == null) {
				return false;
			}
			
		if(x.charAt(i)==y) {
			System.out.println("Exists "+y);
			return true;
		}
			
		}
		return false;
	}

}
