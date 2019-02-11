package week10day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseUsingList {

	public static void main(String[] args) {
		String a="Allan is gonna places soon";
		a=a.replaceAll(" ", "");
		char[] charArray = a.toCharArray();
		List<Character> list= new ArrayList<>();
		for (char c : list) 
			
		Collections.reverse(list);
		ListIterator l1=list.listIterator();
		while(l1.hasNext())
			System.out.println(l1.next());


	}

}
