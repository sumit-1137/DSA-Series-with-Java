package DSA.Arrays;

import java.util.*;
public class InputUsingLoop {
	
	public static void main(String argc[]) {
		
		int [] arr = new int[5];
		
		Scanner sc  = new Scanner(System.in);
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print("Enter the array element : ");
			arr[i] = sc.nextInt();
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		/*
		 * for(int i = 0; i<arr.length;i++) { System.out.print(arr[i]+" ");
		 * 
		 * }
		 */
		/*
		 * for(int num : arr) // for each num in arr print num {
		 * System.out.print(num+" ");
		 * 
		 * }
		 */
		
	}

}
