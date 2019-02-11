package week1day2;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a Number1:");
		int num1 = sc.nextInt();
		System.out.println("Enter a Number2:");
		int num2 = sc.nextInt();
		System.out.println("Enter a Number3:");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " " + "is the largest Number");
		} else if (num2 > num3) {
			System.out.println(num2 + " " + "is the largest Number");
		} else {
			System.out.println(num3 + " " + "is the largest Number");
		}

	}

}
