package week1day2;

import java.util.Scanner;

public class MonthBasedDaysSAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char
		// months[]={'Jan','Feb','Mar','Apr','May','Jun','Aug','Sep','Oct','Nov','Dec'};
		LearningAccessMethods obj = new LearningAccessMethods();
		// obj.SumOfNumber

		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n1 = sc.nextInt();
		int i = n1 - 1;
		int j = i;
		System.out.println("The" + " " + n1 + "th" + " " + "Month of the year is" + " " + months[i]);
		System.out.println("Number of days in the month of" + " " + months[i] + " " + "is" + " " + days[j]);

	}

}
