package DSA.Arrays;

import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		
		int [] arr = new int [5];
		System.out.print("Enter array Element :");
		
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		//Reverse call
		
		Reverse( arr);
		System.out.println(Arrays.toString(arr));
		
		
	
	}
	
	static void Reverse(int arr []) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start<end ) {
			
			//swap call 
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		
		
	}
	
	/*
	 * static void swap(int []arr,int index1,int index2) { int temp = arr[index1];
	 * arr[index1] = arr[index2]; arr[index2] = temp; }
	 */
	

}
