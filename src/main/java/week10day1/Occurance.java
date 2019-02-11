package week10day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		String a="Allan";
		a=a.toLowerCase();
		char[] charArray = a.toCharArray();
		Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
