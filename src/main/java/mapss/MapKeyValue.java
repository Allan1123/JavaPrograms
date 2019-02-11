package mapss;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MapKeyValue {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100,"GameOfThrones");
		map.put(1,"Mario");
		map.put(4,"Casino");
		
		//Map<Integer,String> tmap= new TreeMap<Integer,String>(map);
		//map.remove(4);
		for (Entry<Integer,String> s : map.entrySet()) {
			System.out.println(s.getValue()+" : "+s.getKey());
		}	
		

	}

}
