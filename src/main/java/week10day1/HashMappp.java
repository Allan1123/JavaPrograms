package week10day1;

import java.util.HashMap;
import java.util.Map;

public class HashMappp {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new HashMap<>();
		map.put(2, "Allan");
		map.put(12, "Princy");
		map.put(21, "Monku");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());
			
		}
		
		
		System.out.println(map);
	}

}
