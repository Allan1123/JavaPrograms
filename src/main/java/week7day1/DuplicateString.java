package week7day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String comp="google";
		Set<Character> uniquechar= new LinkedHashSet<Character>();
		char[] charArray = comp.toCharArray();
		for (char c : charArray) {
			uniquechar.add(c);
		}
		System.out.println(uniquechar);


		String comp1 ="google";
		List<Character> list= new ArrayList<Character>(); 
		char[] charArray2 = comp1.toCharArray();
		for (char c : charArray2) {
			if(!list.contains(c)) {
				list.add(c);
			}
		}
		System.out.println(list);
		
		String comp2 ="google";
		String comp3="google";
		ArrayList<Character> arr= new ArrayList<Character>();
		String replace = comp3.replace("g", "");
		System.out.println(comp2.length()-replace.length());

	}
}
