package week9day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceChracter {

	public static void main(String[] args) {
		String a="welcome to automation";
		String b = a.replaceAll(" ", "");
		char[] charArray = b.toCharArray();
		Map<Character, Integer> map= new LinkedHashMap<Character,Integer>();
		for (char eachChar : charArray) {
			if(map.containsKey(eachChar)) {
			map.put(eachChar, map.get(eachChar)+1);	
			}else {
				map.put(eachChar, 1);
			}
			
		}
		System.out.println(map);
	}

}
