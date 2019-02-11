package week10day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String reverse="";
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String orginal=sc.nextLine();
		orginal=orginal.toLowerCase();
		int length = orginal.length();
		for (int i = length-1; i >=0; i--) {
			reverse=reverse+orginal.charAt(i);
		}
		if (orginal.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
//		StringBuilder builder= new StringBuilder(orginal);
//		StringBuilder reverse2 = builder.reverse();
//		System.out.println(reverse2);
	
	}

}
