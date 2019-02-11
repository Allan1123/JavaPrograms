package week1homework;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginal, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check Palindrome:");
		orginal = sc.nextLine();
		int length = orginal.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + orginal.charAt(i);
		}
		if (orginal.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
