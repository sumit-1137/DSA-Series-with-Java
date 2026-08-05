package OOP;

class Payment {
    void pay(int amt) {
        int bal = 0;
        bal += amt; 
        System.out.println("Method of Payment Class ");
        System.out.println("balance " + bal + " | amount " + amt);
    }
}

class UPI extends Payment {
    
    @Override
    void pay(int amt) {
        // 1. Call the parent class (Payment) method first
        super.pay(amt); 
        
        // 2. Run UPI specific code
        System.out.println("Method of UPI Class (Triggered via UPI reference)");
        System.out.println("----------------------------------------------");
    }
}

public class PolyMorEx {
    public static void main(String[] args) {
        
        // Upcasting: Calls UPI's pay(), which triggers super.pay() inside it
        Payment p = new UPI();
        p.pay(100);
        
        // Calls UPI's pay() directly
        UPI u = new UPI();
        u.pay(200);
    }
}
