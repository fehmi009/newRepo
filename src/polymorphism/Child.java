package polymorphism;

public class Child extends Parent {

	@Override
	void myMethod() {
		
		System.out.println("child class");
	}
	int age;
	int today;
	
	@Override
	public void ageCalculate(int age) {
		System.out.println(age);
	}
	
	
//	@Override
//	private void myMethod() { //Cannot reduce the visibility of the inherited method from Parent
//		System.out.println("child class");
//	}
	
}
