package week10day1;

public class StringFive {

	public static void main(String[] args) {
		String a="123.45";
		int count=0;
		for(int i=0;i<a.length();i++) {
			count++;
		}
		if(count==5) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
