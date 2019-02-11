package week10day1;

public class ToLowerCase {

	public static void main(String[] args) {
		String a="allan";
		char[] charArray = a.toCharArray();
		for (char c : charArray) {
			System.out.println((char)((int)c+32));
		}

	}

}
