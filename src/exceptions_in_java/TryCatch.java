package exceptions_in_java;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			
		int[]nums= {1,2,3,4,5,6};
		System.out.println(nums[10]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Something went wrong !!");
		}
		
	}
}
