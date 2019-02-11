package week5day4;

public class SwapTwoString {

	public static void main(String[] args) {
		String a="Allan";
		String b="David";
		System.out.println("The string before swap "+a+" "+b);
		a=a+b;
		//store string a in b
		b=a.substring(0, a.length()-b.length());
		//store string b in a
		a=a.substring(b.length());
		System.out.println("The string value after swap is "+a+" "+b);

	}

}
