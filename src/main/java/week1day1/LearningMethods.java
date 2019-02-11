package week1day1;

import java.util.Scanner;

public class LearningMethods {

	private static Scanner scanObject;

	public static void main(String[] args) {
		scanObject = new Scanner(System.in);
		System.out.println("Enter the Day Number:");
		int day = scanObject.nextInt();

		// int day=3;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
		}

	}

}
