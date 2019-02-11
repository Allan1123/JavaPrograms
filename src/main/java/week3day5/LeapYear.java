package week3day5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Author - Allan - To find the leap year
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		boolean flag = false;
		if (year % 400 == 0) {
			flag = true;
		} else if (year % 100 == 0) {
			flag = false;
		} else if (year % 4 == 0) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("The " + year + " is a leap year");
		} else {
			System.out.println("The " + year + " is not a leap year");
		}

	}

}
