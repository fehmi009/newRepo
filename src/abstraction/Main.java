package abstraction;

public class Main implements MyInterface{

	public static void main(String[] args) {
		
		System.out.println(MyInterface.d);
		
		
		
		
		
	}

	@Override
	public void myMethod2() {
		System.out.println("I have to override the methods in my interface !!!");
		
	}

}
