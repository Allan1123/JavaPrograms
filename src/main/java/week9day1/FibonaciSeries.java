package week9day1;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the n Number: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		for (int i = 0; i <=n-1; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+",");
		}

	}

}
