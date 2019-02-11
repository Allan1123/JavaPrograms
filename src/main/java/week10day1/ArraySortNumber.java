package week10day1;

import java.util.Arrays;

public class ArraySortNumber {

	public static void main(String[] args) {
		int a[]= {3,2,4,1,2,6,7,8,9,10};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j <a.length ; j++) {
				if (a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
		}
		System.out.println(Arrays.toString(a));
	}

}
