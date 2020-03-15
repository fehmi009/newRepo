package list_set_map;

import java.util.ArrayList;

public class List {

	public static void myArrayList() {
	
		ArrayList<String> l = new ArrayList<String>(2); 
		l.add("First");
		l.add("First");
		l.set(1, "Second");
		System.out.println(l);
		String stringList = l.toString();
		System.out.println(stringList);
		System.out.println(stringList.equals(l)); // one of them is List other one is String 
	}
	
	public static void main(String[] args) {
		List.myArrayList();
	}
}
