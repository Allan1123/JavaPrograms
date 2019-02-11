package week4day5;

import java.util.Scanner;

public class LargestNumberandDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("Enter the digit: ");
		int digit = sc.nextInt();
		char c = Integer.toString(digit).charAt(0);
		for (int i = number; i > 0; i--) {
			if (Integer.toString(i).indexOf(c) == -1) {
				System.out.println(i);
				break;
			}

		}

	}

}
