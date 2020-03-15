package abstraction;

abstract class MyAbstractClass {

	abstract void myMethod() ;
	
	public void mySecondMethod() {
		System.out.println("My aregular method");
	}
	
	int age = 5;
	
//	default void method3() {  // default methods are only allowed in interfaces
//		System.out.println("");
//	}

}
