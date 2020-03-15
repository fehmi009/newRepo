package exceptions_in_java;

public class Throws {

	public static void myMethod () throws Exception {
		
		Thread.sleep(5000);

		System.out.println("Exception handled ??");
		
		System.out.println(" YES !!!");
	}
	
	
	
	public static void main(String[] args) throws Exception {
		Throws.myMethod();
	}
}
