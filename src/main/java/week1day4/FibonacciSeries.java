package week1day4;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int number = sc.nextInt();
		int a = 0, b = 0, c = 1;
		for (int i = 1; i <= number; i++) // We know the number of repeatation so we use for loop
		{
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}

	}

}
