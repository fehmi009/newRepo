package mobileHeartbeat;

import java.util.Scanner;

public class IsPalindrome {

	
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a word"); 
//		String name = sc.next();
//
//		String s = "";
//		for (int i = name.length() - 1; i >= 0; i--) {
//			s = s + name.charAt(i);
//		}
//
//		if (name.equalsIgnoreCase(s)) {
//			System.out.println(name + " is a polidrome");
//		} else {
//			System.out.println(name + " is not a palindrome");
//
//		}
		
		removeDup("bbbcfddahhttwa");

		
		
	}
	

	public static void removeDup(String str) {
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if (i != str.lastIndexOf(str.charAt(i))) {
				continue;
			} else {
				result += str.charAt(i);
			}
		}
		
		System.out.println(result);

	}
}
