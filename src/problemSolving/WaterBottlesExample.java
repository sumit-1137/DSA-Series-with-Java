package problemSolving;

class WaterBottoles{
	public int WaterBottoles(int numBottles,int numExchange) {
		int ans = numBottles;
		while(numBottles >= numExchange) {
			int newBottles = numBottles/numExchange;
			int remBottles = numBottles%numExchange;
			ans = ans+ newBottles;
			numBottles = newBottles +remBottles;
			
			
		}
		return ans;
	}
}
public class WaterBottlesExample {
	public static void main(String[] args) {
		
		WaterBottoles w  = new WaterBottoles();
		int res = w.WaterBottoles(15, 4);
		System.out.println(res);
		
	}
}
