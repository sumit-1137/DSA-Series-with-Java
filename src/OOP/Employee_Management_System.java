package OOP;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}

public class Employee_Management_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    empList.add(new Employee(id, name, salary, dept));
                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    if (empList.isEmpty()) {
                        System.out.println("No Employee Found.");
                    } else {
                        for (Employee e : empList) {
                            System.out.println("ID: " + e.id);
                            System.out.println("Name: " + e.name);
                            System.out.println("Salary: " + e.salary);
                            System.out.println("Department: " + e.department);
                            System.out.println("------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Employee e : empList) {
                        if (e.id == searchId) {
                            System.out.println("ID: " + e.id);
                            System.out.println("Name: " + e.name);
                            System.out.println("Salary: " + e.salary);
                            System.out.println("Department: " + e.department);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    for (Employee e : empList) {
                        if (e.id == updateId) {
                            System.out.print("Enter New Salary: ");
                            e.salary = sc.nextDouble();
                            System.out.println("Salary Updated.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    for (int i = 0; i < empList.size(); i++) {
                        if (empList.get(i).id == deleteId) {
                            empList.remove(i);
                            System.out.println("Employee Deleted.");
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);


    }
}