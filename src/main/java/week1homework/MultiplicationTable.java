package week1homework;

import java.util.Scanner;

public class MultiplicationTable {
	static int mul;
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter Number#1:");
		int n1 = sc.nextInt();
		System.out.println("Enter Number#2:");
		int n2 = sc.nextInt();
		System.out.println("The Multiplication table for" + " " + n1 + " " + "is");

		for (int i = 1; i <= n2; i++) {
			mul = i * n1;
			System.out.println(i + "*" + n1 + "=" + mul);

		}

	}

}
