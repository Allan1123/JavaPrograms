package week8day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringRepeatChar {

	public static void main(String[] args) {
		String compName="Scientific Games";
		compName=	compName.replaceAll(" ", "");
		compName=compName.toLowerCase();
		char[] charArray = compName.toCharArray();
		Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		for (char eachChar : charArray) {
			if (map.containsKey(eachChar)) {
				map.put(eachChar, map.get(eachChar)+1);
			}else {
				map.put(eachChar, 1);
			}
		}
		System.out.println(map);
	}

}

//{a=1, s=2, c=2, t=1, e=2, f=1, g=1, i=3, m=1, n=1} - HashMap - randon order
//{s=2, c=2, i=3, e=2, n=1, t=1, f=1, g=1, a=1, m=1} - linked Hsh map - correct order
//{a=1, c=2, e=2, f=1, g=1, i=3, m=1, n=1, s=2, t=1} - ASCI Order




