package DSA.Arrays;

import java.util.*;

public class SwapArray {
	
	public static void main(String argc []) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		for(int i =0;i<5;i++) {
			System.out.print("Enter the array element :");
			arr[i]= sc.nextInt();
		}
		System.out.println(" Array :"+Arrays.toString(arr));
		
		
		
		
		swap(arr);
		System.out.println("Swaped Array :"+Arrays.toString(arr));
	}
	
	static void swap(int []array) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Index position to change : ");
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		
	}
	
	

}
