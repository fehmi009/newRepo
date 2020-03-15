package polymorphism;

public class Child2 extends Parent{

	@Override
	void myMethod() {
		System.out.println("CHILD 2");
	}
	
	
	public void ageCalculate(int age, int Bdate) {
		System.out.println("your age is  " +  age + Bdate);
	}
}
