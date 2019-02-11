package week1homework;

import java.util.Scanner;

public class Cc2_Month {

	// private static Scanner s;

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);

		String[][] Month;
		Month = new String[11][1];
		Month[0][0] = "January";
		Month[1][0] = "February";
		Month[2][0] = "March";
		Month[3][0] = "April";
		Month[4][0] = "May";
		Month[5][0] = "June";
		Month[6][0] = "July";
		Month[7][0] = "August";
		Month[8][0] = "September";
		Month[9][0] = "October";
		Month[10][0] = "November";
		Month[11][0] = "December";

		Month[0][1] = "31";
		Month[1][1] = "29";
		Month[2][1] = "31";
		Month[3][1] = "30";
		Month[4][1] = "31";
		Month[5][1] = "31";
		Month[6][1] = "30";
		Month[7][1] = "31";
		Month[8][1] = "30";
		Month[9][1] = "31";
		Month[10][1] = "30";
		Month[11][1] = "31";

		String scan = s.nextLine();
		// if(Month.contains(k)) {}
		for (int i = 0; i < 11; i++) {

			int c = 0;
			int v = 0;
			boolean check = Month[c][v].equals(scan);
			if (check) {
				System.out.println("pass");
			}
		}

	}
}
