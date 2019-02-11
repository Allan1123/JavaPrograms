package week10day1;

import java.util.Hashtable;

public class HashTableee {

	public static void main(String[] args) {
		Hashtable<Integer, String> t1 = new Hashtable<Integer, String>();
		t1.put(3, "Geeks");
		t1.put(1, "Geeks11");
		t1.put(10, "jjjj");
		
		System.out.println(t1.remove(10));
		System.out.println(t1);
	}
	
	
	
	

}
