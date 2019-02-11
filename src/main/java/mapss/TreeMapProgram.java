package mapss;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(700, "Princy");
		map.put(100, "Allan");
		map.put(400, "Dereck");
		map.put(500, "Johny");
		for (Entry<Integer, String> s:map.entrySet()) {
			System.out.println(s.getValue()+"   "+s.getKey());
		}

	}

}
