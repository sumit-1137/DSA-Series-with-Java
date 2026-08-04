package SearchingAlgorithms;

import java.util.*;

public class LinearSeach {
	public static void main(String[] args) {
		int []arr = new int[5];
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter Array element : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		//call
		System.out.print("Enter Searching element : ");
		int looksfor = sc.nextInt();
		boolean ans = LinearSearch(arr,looksfor);
		System.out.println(ans);
		
	}
	
	static boolean LinearSearch(int arr[],int target) {
		if(arr.length==0) {
			return false;
		}
		
		
		for (int element = 0; element < arr.length; element++) {
			if(arr[element]==target) {
				return true;
			}
			
			
		}
		return false;
	}

}
