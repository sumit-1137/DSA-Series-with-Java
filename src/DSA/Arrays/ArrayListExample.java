package DSA.Arrays;
import java.util.*;

public class ArrayListExample {
	
	public static void main(String argc[]) {
		//Syntax 
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		/*
		 * list.add(10); list.add(11); list.add(12); list.add(13); list.add(14);
		 * list.add(15);
		 * 
		 * 
		 * System.out.println(list.contains(16)); System.out.println(list);
		 * 
		 * System.out.println(list.size()); list.set(0, 23); System.out.println(list);
		 * 
		 * list.remove(4); System.out.println(list);
		 * 
		 * System.out.println(list.size());
		 */
		System.out.print("Enter the number of element to add :");
		int n = sc.nextInt();
		
		for(int i = 0; i<n;i++) {
			System.out.print("Enter elements  : ");
			list.add(sc.nextInt());
		}
		
		for(int i = 0; i<n;i++) {
			System.out.print(" "+list.get(i));
			
		}
		
	}

}
