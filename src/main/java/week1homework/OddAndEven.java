package week1homework;

import java.util.Scanner;

public class OddAndEven {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n1 = sc.nextInt();
		if (n1 % 2 == 0) {
			System.out.println("The given number is EVEN");
		} else {
			System.out.println("The given number is ODD");
		}
	}

}
