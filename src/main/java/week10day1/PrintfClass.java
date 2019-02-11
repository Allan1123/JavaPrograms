package week10day1;

import java.util.Scanner;

public class PrintfClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------------");
		for(int i=0;i<3;i++) {
		String s1=sc.nextLine();
		int n=sc.nextInt();
			System.out.printf("%-15s%03d%n",s1,n);
		}
		
		System.out.println("----------------------------");

	}

}
