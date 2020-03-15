package converting;

public class IntegerToString {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		String s1 = Integer.toString(a);
		String s2 = Integer.toString(b);
		
		System.out.println(s1);
		System.out.println(s2);
		
		int c = Integer.parseInt(s1);
		int d = Integer.parseInt(s2);
		
		System.out.println(c);
		System.out.println(d);
	}

}
