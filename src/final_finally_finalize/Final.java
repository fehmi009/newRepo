package final_finally_finalize;

final class Final { 
	public static void main(String[] args) 
	{ 
		// Non final variable 
		int a = 5; 

		// final variable 
		final int b = 6; 

		// modifying the non final variable : Allowed 
		a++; 

		// modifying the final variable : 
		// Immediately gives Compile Time error. 
		//b++; 
		
		Final.myMethod();
	} 
	
	final static void myMethod () {
		System.out.println("final method");
	}
} 

//class Final_child extends Final{     //Because Final class is final class, it cannot be extended !!!
//	
//	
//}

// Also if you declared a class as final, then its methods become final methods by default !
// final methods cannot be overridden ! 




