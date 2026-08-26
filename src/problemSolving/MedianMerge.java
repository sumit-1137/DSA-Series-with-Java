package problemSolving;

import java.util.Arrays;

public class MedianMerge {
	
	public static double median (int [] nums1, int []nums2) {
		int[] ans = merge(nums1,nums2 );
		if(ans.length % 2 ==0) {
			double ans2 = (double)(ans[ans.length/2]+ans[(ans.length /2)-1])/2;
			return ans2;
			
		}else {
			double ans2 = (double)(ans[ans.length/2]);
			return ans2;
			
		}
		
	}
	
	public static int[] merge(int []arr1,int arr2[]) {
		
		 Arrays.sort(arr2);
		 Arrays.sort(arr1);
		int p1= 0;
		int p2 = 0;
		int p3 = 0;
		int ans[] = new int [arr1.length +arr2.length];
		
		while(p1 < arr1.length || p2 <arr2.length) {
			
			int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
			int val2 = p2< arr2.length ? arr2[p2] :Integer.MAX_VALUE; 
			
			if(val1 <= val2) {
				ans[p3] = val1;
				p1 ++;
			}else  {
				ans[p3] = val2;
				p2 ++;
				
			}
			p3++;
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2,9,4,7,11};
		int [] arr2 = {5,1,6,8,3};
		
		int[] merge = merge(arr1,arr2) ;
		System.out.println(Arrays.toString(merge));
		
		double median = median(arr1,arr2) ;
		System.out.println(median);
		
		
	}

}
