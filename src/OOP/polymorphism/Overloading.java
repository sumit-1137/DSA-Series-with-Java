package OOP.polymorphism;


class SumOfNum {
	
	public int sum(int a, int b) {
		return a+ b;
	}
	
	public int sum(int a, int b , int c) {
		return a+ b +c;
	}
	
	public float sum(float a, float b) {
		return a + b;
	}
}
public class Overloading {
	
	public static void main(String[] args) {
		SumOfNum s1 = new SumOfNum();
		int ans1 = s1.sum(1, 2);
		System.out.println(ans1);
		
		int  ans2 = s1.sum(56,89,36);
		System.out.println(ans2);
		
		float ans3 = s1.sum(ans1, ans2);
		System.out.println(ans3);
		
		
	}

}
