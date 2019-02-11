package week9day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Dup {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("twelve", 12);
		Map<String, Integer> map1=new TreeMap<String, Integer>(map);
				for(Entry<String, Integer> s:map1.entrySet()) {
					System.out.print(s.getKey()+"="+s.getValue()+",");
				}

	}

}
