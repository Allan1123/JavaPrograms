package week1day4;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			a = a * i;
		}
		System.out.println("The factorial of" + " " + n + " " + "is" + " " + a);
	}

}
