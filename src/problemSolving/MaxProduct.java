package problemSolving;

import java.util.*;


public class MaxProduct {
	
	public static int maximumProduct(int []nums) {
		int max = -1;
		int smax = -1;
		
		for(int i = 0; i<nums.length;i++) {
			if(max <nums[i]) { 
				smax = max;
				max = nums[i];
			}else if (smax <nums[i]) {
				smax = nums[i];
			}
			
			
		}int ans =  max *smax;
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Array Size  :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Enter The Array Element :");
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		int result = maximumProduct(arr);
		System.out.println(result);
		
	}

}
