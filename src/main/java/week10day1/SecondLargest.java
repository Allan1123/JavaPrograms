package week10day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {7,3,2,1,2,90,10,33,44,1,2,7};
		Arrays.sort(a);
		for (int j = 0; j < a.length; j++) {
			
			System.out.print(a[j]+",");
		}
		System.out.println(a[a.length-2]);

	}

}
