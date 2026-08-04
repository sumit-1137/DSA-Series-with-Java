package SearchingAlgorithms;

import java.util.*;

public class EvenDigitNum {
	public static void main(String[] args) {
		int [] arr = {
				12,13,88,7,95,775,6575,1
		};
		
		int ans = FindDigit(arr);
		System.out.print(ans);
		
	}
	
	static int FindDigit(int []arr) {
		int cnt =0;
		for (int num : arr) {
			if(even(num)){
				cnt++;
			}
			
		}
		return cnt;
	}
	//
	
	static boolean even(int num) {
		int numOfDigit = digit(num);
		
		if(numOfDigit%2 ==0) {
			return true;
		}
		return false;
	}
	
	//
	
	static int digit(int num) {
		int cnt =0;
		while(num>0) {
			cnt++;
			num =num/10;
			
		}
		return cnt;
	}

}
