package DSA;

public class CountNum {
	public static void main(String argc[]) {
		
		int n = 2432535;
		
		int cnt = 0;
		while(n > 0) {
			int rem = n%10;
			if(rem == 4) {
				
				cnt++;
			}
			n = n/10;
			
		}
		System.out.println(cnt);
	}

}
