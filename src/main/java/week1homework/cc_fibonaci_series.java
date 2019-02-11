package week1homework;

import java.util.Scanner;

public class cc_fibonaci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int c = b.nextInt();// c input
		int temp0 = 0;
		int temp1 = 0;
		int tempnew = 1;
		// System.out.print("0,1");
		for (int i = 1; i <= c; ++i) {

			// tempnew = temp0+temp1;

			temp0 = temp1;
			temp1 = tempnew;
			tempnew = temp0 + temp1;
			System.out.print("," + temp0);
		}

		// System.out.println();
	}

}
