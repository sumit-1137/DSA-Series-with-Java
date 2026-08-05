package OOP;

public class Call_by_Ref {
	
	
	class Employee {
	    String name;
	    double salary;

	    Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	}

	class Company {
	    // 1. Modifies the internal state (This changes the original object)
	    public void giveRaise(Employee emp) {
	        emp.salary += 5000; 
	    }

	}
	
	  public static void main(String[] args) {
		  
	        Company myCompany = new Company();
	        Employee sumit = new Employee("sumit", 50000);

	        System.out.println("Original Salary: " + sumit.salary); // 50000

	        // Test 1: Modifying the object state
	        myCompany.giveRaise(sumit);
	        System.out.println("After Raise: " + sumit.salary); // 55000 (Changed!)

	        // Test 2: Attempting to reassign the reference
	        myCompany.tryToReplaceEmployee(sumit);
	        System.out.println("After Attempted Replacement: " + sumit.name); // John (Unchanged!)
	    }
	}
}
