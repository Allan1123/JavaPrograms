package week2day3;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the values:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum of Numbers in an array:" + " " + sum);
	}

}
