package DSA.Arrays;

import java.util.*;
public class MultiArrList {
	public static void main(String argc[]) {
		
		Scanner sc = new Scanner(System.in);
		
		//Syntax 
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
		
		//intialization 
		
		for(int i =0; i< 3 ; i++) {
			list.add(new ArrayList<>());
			
		}
		
		//add elements 
		
		for(int i =0;i<3;i++) {
			for(int j= 0;j<3;j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list);
		
	}

}
