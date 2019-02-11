package week9day1;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		String lower="ALLAN";
		String upper="allan";
		char[] charArray = lower.toCharArray();
		for (char c : charArray) {
			System.out.print((char)((int)c+32));
			
		}
		
		char[] charArray1 = upper.toCharArray();
		for (char d : charArray1) {
			System.out.print((char)((int)d-32));
			
		}

	}

}
