package week10day1;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {10,3,4,2,1,5,6,2,12};
		int temp;
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 3; j++) {
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
