package problemSolving;


class Tribonacci{
	public int Tribonacci(int x) {
		
		int firstTerm =0;
		int secondTerm = 1;
		int thirdTerm = 1;
		if(x == 0) {
			return firstTerm;	
		}
		else if( x == 1) {
			return secondTerm;
		}
		else if(x ==2 ) {
			return thirdTerm;
		}
	
		
		for(int i =0; i<x;i++) {
			int fourth = firstTerm + secondTerm + thirdTerm;
			secondTerm = thirdTerm;
			firstTerm =secondTerm;
			thirdTerm = fourth;
			//System.out.print(fourth + " ");
		}
		return firstTerm;
		
	}
}
public class TribonacciExample {
	public static void main(String[] args) {
		
		Tribonacci t1= new Tribonacci();
		int ans1 = t1.Tribonacci(25);
		System.out.println(ans1);
		
		Tribonacci t2= new Tribonacci();
		int ans2 = t1.Tribonacci(4);
		System.out.println(ans2);
	}
}
