package week3day7;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		int a, b, num = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in the Floyds Triangle: ");
		int n = sc.nextInt();
		System.out.println("The Floyds Triangle is: ");
		for (a = 1; a <= n; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}

}
