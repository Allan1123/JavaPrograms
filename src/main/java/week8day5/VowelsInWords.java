package week8day5;

import java.util.Scanner;

public class VowelsInWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vowels ");
		String str = sc.nextLine();
		str=str.toLowerCase();
		System.out.println("The vowels count "+count_vowwels(str));
	}
	public static int count_vowwels(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
}

