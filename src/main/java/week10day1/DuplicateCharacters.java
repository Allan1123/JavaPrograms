package week10day1;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String a="Allan is good boy";
		a=a.toLowerCase();
		a=a.replaceAll(" ", "");
		char[] charArray = a.toCharArray();
		HashMap<Character, Integer> map= new HashMap<Character,Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println("-------------------------------------------------");
		Set<Character> set= map.keySet();
		for (Character ch : set) {
			if (map.get(ch)>1) {
				System.out.println(ch+"----->"+map.get(ch));
			}
		}
	}

}
