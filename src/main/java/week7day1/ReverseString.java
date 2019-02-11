package week7day1;

public class ReverseString {

	public static void main(String[] args) {
		String str="Allan is Good";
		//char[] charArray = str.toCharArray();
		int length = str.length();
		for (int i=length-1;i>=0;i--) {
			//System.out.print(charArray[i]);
			System.out.print(str.charAt(i));
		}
			
			StringBuilder build= new StringBuilder(str);
			StringBuilder reverse=build.reverse();
			System.out.println("\n"+reverse);
//			
//			for (char c : reverse.toString().toCharArray()) {
//				System.out.println(c);
//				
//			}
		}

	}


