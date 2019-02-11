package week10day1;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int a=0,b=1,c=1;
		for (int i = 1; i < n; i++) {
			a=b;
			b=c;
			c=a+b;
			
			System.out.print(a+",");
		}

	}

}
