package week10day1;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NumberOfOccure {

	public static void main(String[] args) {
		String a="AAABBBCCCCDDDD";
		char[] charArray = a.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		 
		ChromeDriver driver = new ChromeDriver();
		Actions ac= new Actions(driver);
		ac.contextClick();
		
	}

}
