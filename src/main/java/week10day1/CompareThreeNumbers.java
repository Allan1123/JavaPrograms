package week10day1;

import java.util.Scanner;

public class CompareThreeNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		System.out.println("Enter the Third Number");
		int c =sc.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println(a+" is Greater");
		}
		else if((b>c)&&(b>a)) {
			System.out.println(b+" is Greater");
		}
		else {
			System.out.println(c+" is Greater");
		}
	}

}
