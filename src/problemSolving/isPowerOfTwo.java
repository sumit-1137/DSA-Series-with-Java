
/*Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.*/


package problemSolving;

class CheckisPowerOfTwo{
	public boolean isPowerOfTwo(int num) {
		if(num <1) {
			return false;
			}
		while(num%2 ==0) {
			num = num/2;
		}
		if(num ==1) {
			return true;
		}else {
			return false;
		}
	}
}
public class isPowerOfTwo {
	public static void main(String[] args) {
		
		CheckisPowerOfTwo c = new CheckisPowerOfTwo();
		boolean ans = c.isPowerOfTwo(0);
		
		System.out.println(ans);
		
	}
}
