package OOP;


class Bank {
    String name = "Union Bank";
    String location = "Naigaon";
    int branchCode = 123;
}



class Customer {
    String customerName = "Amit Sharma";
    int accountNumber = 98765;
    double balance = 5000.0;

    // This method takes a Bank object as an argument
    void displayProfile(Bank bank) {
        System.out.println("--- Customer Profile ---");
        System.out.println("Name: " + customerName);
        System.out.println("Acc No: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("Bank: " + bank.name + " (" + bank.location + ")");
    }
}

public class Bank_inheritance {
    public static void main(String[] args) {
        // 1. Create the Bank object
        Bank myBank = new Bank();

        // 2. Create the Customer object
        Customer myCustomer = new Customer();

        // 3. Pass the Bank object to the Customer's method
        myCustomer.displayProfile(myBank);
    }
}
