package week3day4;

import java.util.Scanner;

public class DupNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No elements to be inserted in the array:");
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("Enter the " + i + " value in array");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " is a duplicate number in the given Array");
				}
			}
		}
	}
}
