package week10day1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {

	public static void main(String[] args) {
		Set<String> set= new LinkedHashSet<String>();
		set.add("Allan");
		set.add("Princy");
		set.add("John");
		set.add("Princy");
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}


