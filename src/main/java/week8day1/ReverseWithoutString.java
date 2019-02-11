package week8day1;

public class ReverseWithoutString {

	public static void main(String[] args) {
		String a="dooG si nallA";
		System.out.println(a);
		char[] charArray = a.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}

}
