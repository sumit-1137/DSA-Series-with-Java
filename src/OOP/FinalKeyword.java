package OOP;

class A {
	 final int bank_id = 1137;
	 String bank_name ;
	 
	 //prevent modification 
	 //has to be initialise variable
	 
	 
	 A(String bank_name,int bank_id){
		//this.bank_id= bank_id;S
		 this.bank_name =bank_name;
	 }
	

	 void bankId(int x) {
		 System.out.println("Bank ID :"+bank_id);
		 System.out.println("Bank Name:"+bank_name);
	 }
	 
}

public class FinalKeyword {
	
	public static void main(String[] args) {
		
		A obj = new A("sumit",5);
		obj.bankId(10); //output : Bank ID :1137  bank id will not chanf=ge any more
		
	}

}
