package week8day1;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		String a="ALLAN";
		char[] charArray = a.toCharArray();
		for (char c : charArray) {
			System.out.print((char)((int)c+32));
		}
		
	}

}
