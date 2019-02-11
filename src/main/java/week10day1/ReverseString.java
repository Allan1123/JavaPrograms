package week10day1;

public class ReverseString {

	public static void main(String[] args) {
		String a="ycnirP dna nallA";
		
		
		int length = a.length();
		for (int i = length-1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
		
		
		StringBuilder builder = new StringBuilder(a);
		StringBuilder reverse= builder.reverse();
		System.out.println("\n"+reverse);
		
		
		StringBuffer buffer= new StringBuffer(a);
		StringBuffer reverse2 = buffer.reverse();
		System.out.println("\n"+reverse2);
	}

}
