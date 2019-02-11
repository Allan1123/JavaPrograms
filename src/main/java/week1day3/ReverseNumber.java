package week1day3;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0, rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		temp = number;
		while (temp > 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		System.out.println("The Reversed number is " + rev);

	}

}
