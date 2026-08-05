package OOP;

class Bank1 {
	protected double bal;
	
	public void show() {
		System.out.println(bal);
	}
	
	public void deposite(int amt) {
		bal += amt;
		System.out.println("Balance : "+bal + " | amount Credited :"+amt);
	}
	public void withdrow(int amt) {
		bal -= amt;
		System.out.println("Balance : "+bal + " | amount Credited :"+amt);
	}
	
}

class ATM extends Bank1{
	Bank1 b1 = new Bank1();
	public void show () {
		System.out.println("Balance : "+b1.bal); 
	}
	
	
	
}

	


public class EncapExample {
	
	public static void main(String[] args) {
		Bank1 b2 = new Bank1 ();
		b2.show();
		b2.deposite(100);
		
		
		ATM a = new ATM();
		a.show();
		
		
	}

}
