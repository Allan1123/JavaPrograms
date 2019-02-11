package week10day1;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int a[]= {4,2,10,6,8,9,10,11};
		int b[]= new int[4];
		for (int i = 0; i < 4; i++) {
			b[i]=a[i];
		}
		Arrays.sort(b);
		for(int j=0;j<4;j++)
		{
			a[j]=b[j];
		}
		System.out.println(Arrays.toString(a));

	}

}
