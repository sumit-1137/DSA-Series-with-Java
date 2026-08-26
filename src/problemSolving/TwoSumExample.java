package problemSolving;

import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int arr[], int target) {
        int[] ans = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i; // store index i
                    ans[1] = j; // store index j
                    return ans; // return immediately once found
                }
            }
        }
        
        return new int[]  {-1, -1}; // return -1 if no solution found
    }
}

public class TwoSumExample {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int nums[] = {5, 6, 8, 3, 9, 4, 2};
        
        int ans[] = obj.twoSum(nums, 17);
        System.out.println(Arrays.toString(ans));
    }
}
