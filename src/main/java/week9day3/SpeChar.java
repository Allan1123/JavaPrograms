package week9day3;

public class SpeChar {

	public static void main(String[] args) {
		String a=" $$ Welcome to 1st Automation Interview $$ ";
		String all = a.replaceAll("\\D", "");
		String all1 = a.replaceAll("\\w", "");
		String all2 = a.replaceAll("\\W", "");
		System.out.println(all);
		System.out.println(all1);
		System.out.println(all2);
	}

}
