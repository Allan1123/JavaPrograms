package week10day1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapProgram {
	public static void main(String[] args) {
		Map<Integer, String> map= new TreeMap<Integer, String>();
		map.put(4,"Allan");
		map.put(2,"David");
		for (Entry<Integer, String> s : map.entrySet()) {
			System.out.println(s.getValue()+" "+s.getKey());
		}
	
	}

}
