package week1homework;

import java.util.Scanner;

public class PalindromeDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginal, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		orginal = sc.nextLine();
		orginal=orginal.toLowerCase();
		int length = orginal.length();
		for (int i = length - 1; i >=0; i--) {
			reverse = reverse + orginal.charAt(i);
		}
		if (orginal.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
