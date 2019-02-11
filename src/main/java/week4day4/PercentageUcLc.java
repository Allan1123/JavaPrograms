package week4day4;

import java.text.DecimalFormat;

public class PercentageUcLc {

	static void charPercentage(String input) {
		int totalchar = input.length();
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		int others = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uppercase++;
			} else if (Character.isLowerCase(ch)) {
				lowercase++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				others++;
			}
		}

		double uppercasepercentage = (uppercase * 100) / totalchar;
		double lowercasepercentage = (lowercase * 100) / totalchar;
		double digitspercentage = (digits * 100) / totalchar;
		double otherpercentage = (others * 100) / totalchar;

		DecimalFormat format = new DecimalFormat("##.##");
		System.out.println("In '" + input + " :'");
		System.out.println("Uppercase letters are " + format.format(uppercasepercentage) + " %");
		System.out.println("Lowercase letter are " + format.format(lowercasepercentage) + " %");
		System.out.println("Digits are " + format.format(digitspercentage) + " %");
		System.out.println("Other character are " + format.format(otherpercentage) + " %");

	}

	public static void main(String[] args) {
		charPercentage("HI Allan how are you @7:00 AM");

	}

}
