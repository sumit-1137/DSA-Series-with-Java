package DSA.Arrays;

import java.util.*;
public class MaxNumInArray {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array :");
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter elments of array :");
			arr[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		//find max in array 
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];			
			}	
		}System.out.println("Largest Among array is "+max);
		
		
		//call function 
		System.out.print("Enter Start And end : ");
		int x= sc.nextInt();
		int y= sc.nextInt();
		MaxInRange(arr,x,y);
		
	}
	static void MaxInRange(int []arr, int start,int end ) {
		int max = arr[start];
		for (int i = start; i <= end; i++) {
			if(arr[i]>max) {
				max = arr[i];			
			}	
		}System.out.println("Largest Among array is "+max);
	}
}
