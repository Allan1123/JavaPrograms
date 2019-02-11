package week9day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapBasedSort {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "One");
		map.put(17, "Seventeen");
		map.put(12, "twelve");
		map.put(5, "five");
		map.put(2, "two");
		map.put(25, "twentyfive");
		
		Map<Integer,String> map1 = new TreeMap<Integer,String>(map);
		for (Entry<Integer, String> s: map1.entrySet() ) {
			System.out.print(s.getValue()+"="+s.getKey()+",");
		}
	}

}
