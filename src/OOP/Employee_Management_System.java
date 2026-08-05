package OOP;
import java.util.*;
class employee
{
	int id;
	String name;
	double salary;
	String dep;
	
	employee(int id, String name, String dep, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dep=dep;
		
	}
}


public class Employee_Management_System {
	
	
	
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		ArrayList<employee>employeelist=new ArrayList<>();
		
		int ch = sc.nextInt();
		
		do {
			System.out.println("************Employee Managment System ************");
			System.out.println("1.Add Employee \n2.View Employee\n3.Search Employee \n4.Update employee Salary \n5.Delete Employee\n6.Exit");
			System.out.println("\nEnter Your Choice :");
			
			
			switch(ch)
			{
			case 1:
				System.out.println("enter emp id");	
				int id =sc.nextInt();
				
                System.out.println("enter salary :");
				int salary =sc.nextInt();
				
				System.out.println("enter dep : ");
				String dep =sc.next();
				
				System.out.println("enter emp name");
				String name =sc.next();
				
				//employeelist.add(new employee(id,name,dep,salary);
				
				break;
			
				case 2 :
					System.out.println("ID : "+id+"\n2.Name : "+name+"");
				
				
				
			}
			
		}while(ch!= 6);
		
		
	}

}
