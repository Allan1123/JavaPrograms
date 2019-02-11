package week10day1;

import java.util.Scanner;

public class PalindromeHacker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check if its palindrome or not");
        String A=sc.next();
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())? "Yes" :"No");
	}

}
