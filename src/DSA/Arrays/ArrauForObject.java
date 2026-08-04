package DSA.Arrays;

import java.util.*;


public class ArrauForObject {
	public static void main(String argc[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		String arr[] =new String[5] ;
		
		for(int i = 0;i<arr.length;i++ ) {
			System.out.print("Enter the name : ");
			arr[i] = sc.next();
			
		}
		
		
		System.out.println(Arrays.toString(arr)); // method 1 display
		
		//method 2 display
		
		for(int i = 0;i<arr.length;i++ ) {
			System.out.print(" "+arr[i]+" ");
			
		}
		
		//method 3 display
		System.out.println();
		System.out.println(arr[1]+" "+arr[2]);
		
	}

}
