package week10day1;

import java.util.Scanner;

public class ReverseStringg {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String reverse="";
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a=a.toLowerCase();
		int length = a.length();
		for (int i = length-1; i>=0; i--) {
			reverse=reverse+a.charAt(i);
		}
		if (a.equals(reverse)) {
			System.out.println("Panindrome");
		}else {
			System.out.println("Not a palindorme");
		}
	}

}
