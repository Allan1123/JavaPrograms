package week7day3;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		 n=sc.nextInt();
		 for(int i=1;i<n;i++) {
			 if(n%i==0) {
				 sum=sum+i;
			 }
		 }
		if(sum==n) {
			System.out.println("The number is perfect");
		}
		else {
			System.out.println("The number is not perfect");
		}

	}

}
