package week1day3;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0, rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		temp = number;
		while (temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (rev == number) {
			System.out.println("The Given Number is a Palindrome");
		} else {
			System.out.println("The Given Number is not a Palindrome");
		}

	}

}
