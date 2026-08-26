package OOP;

class Singleton{
	 int age ;
	private Singleton() {
		this.age =age;
	}
	private static Singleton instance;
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
		
	}
	
	
}
public class SingletonClass {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance() ;
		Singleton singleton2 = Singleton.getInstance() ;
		Singleton singleton3 = Singleton.getInstance() ;
		
		// all obj reffering single instance only
	}

}
