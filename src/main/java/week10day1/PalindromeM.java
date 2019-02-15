package week10day1;

import java.util.Scanner;

public class PalindromeM {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b="";
		for (int i =a.length()-1; i >=0; i--) {
			b=b+a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.println("It is palindorme");
		}else {
			System.out.println("It is not a palindrome");
		}
	}

}
