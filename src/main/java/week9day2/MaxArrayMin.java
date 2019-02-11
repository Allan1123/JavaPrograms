package week9day2;

import java.util.Arrays;

public class MaxArrayMin {

	public static void main(String[] args) {
		int a[]= {11,13,3,7,18,8,9,8};
		Arrays.sort(a);
		System.out.println("The Maximum Number is "+a[a.length-1]);
		System.out.println("The Minimun Number is "+a[0]);

	}

}


