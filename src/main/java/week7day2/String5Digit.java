package week7day2;

import java.util.regex.Pattern;

public class String5Digit {

	public static void main(String[] args) {
		String str="12367";
		String p="[\\d]{5}";
		System.out.println("Input: "+str+"\tOutput : "+Pattern.matches(p, str));
//		int length = str.length();
//		for(int i=0;i<length;i++) {
//			if(length==5) {
//				System.out.println("True");
//			}
//			else {
//				System.out.println("False");
//			}
//			break;
//		}

	}

}
