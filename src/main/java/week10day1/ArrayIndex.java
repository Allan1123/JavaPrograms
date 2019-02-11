package week10day1;

import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {	
		int a[]= {4,2,1,5,2,3,9,4,32,0};
		int temp;
		//Arrays.sort(a, 0, 4);
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

		//System.out.println(Arrays.toString(a));

	}

}

