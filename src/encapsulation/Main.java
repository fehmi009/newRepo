package encapsulation;

public class Main {

	public static void main(String[] args) {
	
		A a = new A();
		a.setAge(25);
		System.out.println(a.getAge());
	
		a.setName("Fehmi");
		System.out.println(a.getName());
		
		/*
		 I have private variables and I want to use them (think like bank account)
		 So I should be able to set and get them. 
		 For that, I will ned setter and getter methods.
		 Set method should set the variable as I want it (String newName)//(int newAge)
		 Get method should return the variable. return name // return age
		 
		 THIS IS ENCAPSULATION, 
		 WE CAN ACHIEVE ENCAPSULATION BY USING 'PRIVATE' KEYWORD
		 
		 */
	}

}
