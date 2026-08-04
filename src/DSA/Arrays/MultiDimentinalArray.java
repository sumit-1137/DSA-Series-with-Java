package DSA.Arrays;

import java.util.Arrays;
import java.util.*;

public class MultiDimentinalArray {

	public static void main(String argc[]) {

		/*
		 * int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		 */
		Scanner sc = new Scanner(System.in);

		int arr2[][] = new int[3][3];
		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print("Enter element :");
				arr2[i][j] = sc.nextInt();

			}

		}
		
		
		
		//DISPLAY BY SHORTCUT
		/*
		 * for(int i = 0;i<arr2.length;i++) {
		 * System.out.println(Arrays.toString(arr2[i])); }
		 */
		
		
		//enchance for loop 
		
		for(int[] a : arr2) {
			System.out.println(Arrays.toString(a));
			
			
		}
		
		
		
		
			// display using for loop  
			/*
			 * for (int i = 0; i < arr2.length; i++) {
			 * 
			 * for (int j = 0; j < arr2[i].length; j++) {
			 * 
			 * System.out.print(arr2[i][j] + " ");
			 * 
			 * } System.out.println();
			 * 
			 * }
			 */

		// System.out.println(Arrays.deepToString(arr)); //Method1

		// using for loop
		/*
		 * for(int i=0 ;i<arr.length;i++) {
		 * 
		 * for(int j= 0;j<arr.length;j++) {
		 * 
		 * System.out.print(arr[i][j] +" "); } System.out.println();//new line
		 * 
		 * 
		 * }
		 */
	}

}
