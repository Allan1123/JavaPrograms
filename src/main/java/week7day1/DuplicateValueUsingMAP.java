package week7day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateValueUsingMAP {

	public static void main(String[] args) {
		String company="Scientific Games";
		company=company.replaceAll("\\s", "");
		company=company.toLowerCase();
		char[] charArray = company.toCharArray();
		Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for (char c : charArray) {
			//System.out.println(c);
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
				System.out.print(c);
			}
		}
	}

}
