package week2day5;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("\tFIZZBUZZ");
			} else if (i % 5 == 0) {
				System.out.print("\tBIZZ");
			} else if (i % 3 == 0) {
				System.out.print("\tFIZZ");
			} else {
				System.out.print("\t" + i);
			}

		}

	}

}
