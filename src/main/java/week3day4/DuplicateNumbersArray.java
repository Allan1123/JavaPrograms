package week3day4;

import java.util.Arrays;

public class DuplicateNumbersArray {

	public static void main(String[] args) {

		//int[] a = { 2, 3, 4, 5, 3, 2, 1, 2, 2, 2, 2, 2, 2, 5, 5, 5, 5, 5 };
		int a[]= {1,2,3,2,1,2,3,4,5,3};
		Arrays.sort(a);
		String repeatednum = "";
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1])

			{
				if (!repeatednum.equals(a[i] + " ")) {
					repeatednum = a[i] + " ";
					System.out.println("The duplicate elements are: " + repeatednum);
				}
			}
		}
		System.out.println();
	}

}
