package problemSolving;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class TwoSumExample1 {
	
	public static int[] twoSum(int arr[],int target) {
		int []ans = new int[2];
		
		for(int i = 0 ;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				ans[0] = i;
				ans[1] =j;
				return ans;
			}
		}
		return new int[]  {-1,-1};
	}
	public static void main(String[] args) {
		
		int nums[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Element :");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			
		}
		
		System.out.print("Enter the Target value :");
		int target = sc.nextInt();
		
		int result[] = twoSum(nums,target);
		System.out.println(Arrays.toString(result));
		
		
	}

}
