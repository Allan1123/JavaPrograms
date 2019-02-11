package week2homework;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String orginal = sc.nextLine();
		// int n=orginal.length();
		for (int i = orginal.length() - 1; i >= 0; i--) {
			reverse = reverse + orginal.charAt(i);

		}
		if (orginal.equals(reverse)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
