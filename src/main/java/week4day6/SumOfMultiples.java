package week4day6;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		ArrayList<Integer> x = new ArrayList();
		ArrayList<Integer> y = new ArrayList();
		int sumofthree = 0;
		int sumoffive = 0;
		int temp = num;
		for (temp = 1; temp < 20; temp++) {
			if (temp % 3 == 0) {
				x.add(temp);
				sumofthree += temp;
			} else if (temp % 5 == 0) {
				x.add(temp);
				sumoffive += temp;
			}

		}
		int total = sumofthree + sumoffive;

		System.out.println(total);

	}

}
