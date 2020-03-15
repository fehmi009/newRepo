package polymorphism;

public class Main {

	public static void main(String[] args) {
		Parent a ;
		a= new Child();
		a.myMethod();
		
		a = new Child2();
		a.myMethod();
		
		
		
	}
}
