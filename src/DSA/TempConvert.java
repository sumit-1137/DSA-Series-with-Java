package DSA;
import java. util.*;
public class TempConvert {
	
		public static void main(String []argc ) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter The Temperature in 'C :");
			float tempC = sc.nextFloat();
			
			Float tempF = (tempC * 9/5) +32;
			System.out.println("Temperature in Faranite F :"+tempF);
			
			
		}
}
