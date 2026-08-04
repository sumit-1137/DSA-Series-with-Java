package SearchingAlgorithms;

import java .util.*;

public class SearchInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The name : ");
		String str = sc.nextLine() ;
		
		System.out.print("Enter char To Search : ");
		char target =sc.next().charAt(0);
		
	  boolean ans = search(str,target, 3,7);
	  System.out.println(ans);
		
	}

	static boolean search(String x,char y, int start,int end) {
		for (int i = start; i <=end ; i++) {
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
