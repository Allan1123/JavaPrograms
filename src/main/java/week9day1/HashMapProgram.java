package week9day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapProgram {

	public static void main(String[] args) {
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(21, "Twenty One");
		map.put(41, "Fourty One");
		map.put(31, "Thirty One");
	
		Map<Integer, String> map1 = new TreeMap<Integer, String>(map); 
		System.out.println("After Sorting: ");
		Set set1=map1.entrySet();
		Iterator Iterator1=set1.iterator();
		while(Iterator1.hasNext()) {
			Map.Entry me2=(Map.Entry)Iterator1.next();
			System.out.print(me2.getKey()+"=");
			System.out.println(me2.getValue());
		}
	}

}
