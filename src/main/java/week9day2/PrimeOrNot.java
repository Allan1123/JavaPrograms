package week9day2;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n,temp;
		boolean isPrime=true;
		System.out.println("Enter the number to check if its prime or not");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for (int i = 2; i <=n/2; i++) {
			temp=n%i;
			if (temp==0) {
				isPrime=false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
