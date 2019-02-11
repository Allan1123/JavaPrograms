package week10day1;

import java.util.HashSet;
import java.util.Set;

public class ArraySoryArrayList {
	public static void main(String[] args) {
		int a[]= {3,5,1,22,6,7,2,3,4,10,1,3,4,5};
		Set<Integer> set= new HashSet<>();
		for (int c : a) {
			if (!set.contains(c)) {
				set.add(c);
			}
			
		}
		System.out.println(set);
	}
	

}
