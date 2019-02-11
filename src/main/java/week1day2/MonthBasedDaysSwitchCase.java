package week1day2;

import java.util.Scanner;

public class MonthBasedDaysSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n1 = sc.nextInt();
		switch (n1) {
		case 1:
			System.out.println("The 1st Month of the Year is Jan" + '\n' + "Number of days in the month of Jan is 31");
			break;
		case 2:
			System.out.println("The 2nd Month of the Year is Feb" + '\n' + "Number of days in the month of Feb is 28");
			break;
		case 3:
			System.out.println("The 3rd Month of the Year is Mar" + '\n' + "Number of days in the month of Mar is 31");
			break;
		case 4:
			System.out.println("The 4th Month of the Year is Apr" + '\n' + "Number of days in the month of Apr is 30");
			break;
		case 5:
			System.out.println("The 5th Month of the Year is May" + '\n' + "Number of days in the month of May is 31");
			break;
		case 6:
			System.out.println("The 6th Month of the Year is Jun" + '\n' + "Number of days in the month of Jun is 30");
			break;
		case 7:
			System.out
					.println("The 7th Month of the Year is July" + '\n' + "Number of days in the month of July is 31");
			break;
		case 8:
			System.out.println("The 8th Month of the Year is Aug" + '\n' + "Number of days in the month of Aug is 31");
			break;
		case 9:
			System.out.println("The 9th Month of the Year is Sep" + '\n' + "Number of days in the month of Sep is 30");
			break;
		case 10:
			System.out.println("The 10th Month of the Year is Oct" + '\n' + "Number of days in the month of Oct is 31");
			break;
		case 11:
			System.out.println("The 11th Month of the Year is Nov" + '\n' + "Number of days in the month of Nov is 31");
			break;
		case 12:
			System.out.println("The 12th Month of the Year is Dec" + '\n' + "Number of days in the month of Dec is 31");
		}

	}

}
