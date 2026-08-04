package DSA.Arrays;

import java.util.Arrays;

public class ArrayFunction {
	public static void main(String argc []) {
		
		int num[] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(num)); // before change
		change(num);
		System.out.println(Arrays.toString(num)); //after change
		
	}
	static void change(int [] arr) {
		arr[0] = 100;
		
	}

}
