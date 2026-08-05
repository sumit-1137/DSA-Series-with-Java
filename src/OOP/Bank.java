package OOP;
import java.util.*;

public class Bank {
    
    // Instance variables (unique for each bank account object)
    int balance;
    String bankName;

    // Constructor to initialize each bank account
    public Bank(String bankName, int initialBalance) {
        this.bankName = bankName;
        this.balance = initialBalance;
    }
    
    // Displays current balance
    void checkBal() {
        System.out.println(bankName + "Bank Balance: " + balance);
    }
    
    // Adds money to balance
    void deposit(int amt) {
        balance = balance + amt;
        System.out.println("Deposited: " + amt + " | New Balance: " + balance);
    }
    
    // Subtracts money from balance
    void withdraw(int amt) {
        if (amt <= balance) {
            balance = balance - amt;
            System.out.println("Withdrew: " + amt + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds to withdraw " + amt);
        }
    }
    
    public static void main(String[] args) {
        // Creating an individual bank account object
        Bank myAccount = new Bank("Union", 1000);
        
        // Calling methods on the object
        myAccount.checkBal();    
        myAccount.deposit(100);
        myAccount.withdraw(100);
        myAccount.checkBal();
    }
}
