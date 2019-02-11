package week10day1;

import java.util.HashMap;
import java.util.Map;

public class WordsInSentence {

	public static void main(String[] args) {
		String a="India is my country country";
		//a=a.toLowerCase();
		String[] split = a.split(" ");
		Map<String, Integer> map= new HashMap<String, Integer>();
		for (String string : split) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string)+1);
			}else {
				map.put(string, 1);
			}
		}
		System.out.println(map.get("country"));
		System.out.println(map);
	}
}
