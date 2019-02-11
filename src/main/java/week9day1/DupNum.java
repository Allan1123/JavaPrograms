package week9day1;

import java.util.Arrays;

public class DupNum {
	public static void main(String[] args) {
		int a[]= {1,2,3,2,2,3,4,2,5,6};
		Arrays.sort(a);
		//System.out.println(removeDuplicate());
		String reapNum="";
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]==a[i+1]) {
				if (!reapNum.equals(a[i]+" ")) {
					reapNum=a[i]+" ";
					System.out.println("The Duplicate Numbers are: "+reapNum);
				}
			}
		}
		System.out.println();
		}
}
