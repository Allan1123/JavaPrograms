package week3day3;

public class AmstrongNumbers {

	public static void main(String[] args) {
		// Author: Allan //Program - To find the AmstrongOfNumbers
		int n, rem, sum = 0;
		System.out.println("The Amstrong Numbers from 100 to 1000:");
		for (int i = 100; i <= 1000; i++) {
			n = i;
			while (n > 0) {
				rem = n % 10;
				sum = sum + (rem * rem * rem);
				n = n / 10;
			}
			if (sum == i) {
				System.out.print(i + ", ");

			}
			sum = 0;
		}
	}

}
