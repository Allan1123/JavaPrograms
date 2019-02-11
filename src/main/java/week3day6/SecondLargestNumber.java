package week3day6;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The Second largest number is " + a[n - 2]);
	}

}
