package week2day2;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n Numbers:");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			int p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0) {
				System.out.print(i + ",");
			}
		}
	}

}
