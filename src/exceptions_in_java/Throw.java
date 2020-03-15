package exceptions_in_java;

public class Throw {

	public static void main(String[] args) {
		
		try {
			
			throw new ArrayIndexOutOfBoundsException("Exception thrown");
			// 'throw'  keyword throws exception !
			// if some exceptions thrown by the code and you don't know some of them
			// you could handle all of it with (Exception e)
			// then you could use -throw e;- so you can see the thrown exception 
			
			/*
			 * throws is a keyword in Java which is used
			 *  in the signature of method to indicate that 
			 *  this method might throw one of the listed type 
			 *  exceptions. The caller to these methods has to 
			 *  handle the exception using a try-catch block.
			 */
			
			}catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Something went wrong !!");
			}
	}
}
