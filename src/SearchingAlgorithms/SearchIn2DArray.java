package SearchingAlgorithms;

import java.util.*;

public class SearchIn2DArray {
	public static void main(String[] args) {
		
		inputArray();
	
		
		
		
	}
	
	static void inputArray() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the 2D array Size : ");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		System.out.print("Enter the Array Elements :");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]= sc.nextInt();
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		//
		
		System.out.print("Enter the Searching Element : ");
		int n1 = sc.nextInt();
		int ans = 0 ;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]== n1) {
					ans = arr[i][j];
				}
				if(arr[i][j]!= n1){
					ans = arr[i][j];
					System.out.print("Element "+ans+" is not present ");
				}
			  }
				
			}
		System.out.print("Element "+ans+" is present ");
		
	}
	
	
	
	
	}


