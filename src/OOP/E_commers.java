package OOP;


class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Price: " + price);
    }
}

// Subclass coupled directly with Product via inheritance
class Electronics extends Product {
    int warrantyMonths;

    Electronics(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    void display() {
        System.out.println("Electronics: " + name + ", Price: " + price + ", Warranty: " + warrantyMonths + "m");
    }
}

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    void display() {
        System.out.println("Clothing: " + name + ", Price: $" + price + ", Size: " + size);
    }
}

public class E_commers {
    public static void main(String[] args) {
        // Array holding base type references to child objects
        Product[] catalog = new Product[2];
        catalog[0] = new Electronics("Laptop", 1200.00, 24);
        catalog[1] = new Clothing("T-Shirt", 20.00, "M");

        for (Product p : catalog) {
            p.display();
        }
    }
}
