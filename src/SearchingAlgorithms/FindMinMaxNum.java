package SearchingAlgorithms;

import java.util.*;

public class FindMinMaxNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size 'n': ");
		int n = sc.nextInt();
		
		int [] arr1 = new int[n];
		System.out.print("Enter Array Element : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]= sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr1));
		
		MaxNum(arr1);
		MinNum(arr1);
		
		
	}
	static void MaxNum(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {	
			if(max <arr[i]) {
				max = arr[i];
				
			}
			
			
		}
		System.out.println(max);
		
		
		
	}
	
	static void MinNum(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {	
			if(min >arr[i]) {
				min = arr[i];
				
			}
			
			
		}
		System.out.println(min);
		
		
		
	}


}
