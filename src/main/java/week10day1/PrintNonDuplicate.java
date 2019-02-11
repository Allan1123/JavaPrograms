package week10day1;

import java.util.HashSet;
import java.util.Stack;

public class PrintNonDuplicate {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,2,3,4,2,5,6};
		Stack<Integer> sc= new Stack<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (set.add(a[i])==true) {
				sc.push(a[i]);
			}
		}
		System.out.println(sc);
	}
}
