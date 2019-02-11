package week9day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapProgram {

	public static void main(String[] args) {
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(21, "Twenty One");
		map.put(41, "Fourty One");
		map.put(31, "Thirty One");
	
		Map<Integer, String> map1 = new TreeMap<Integer, String>(map); 
		for (Entry<Integer, String> s: map1.entrySet() ) {
			
			System.out.println(s.getKey()+" : "+s.getValue());
		}
	}

}
