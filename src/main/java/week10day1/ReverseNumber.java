package week10day1;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=444,b,c=0,d;
		b=a;
		while(a>0) {
			d=a%10;
			c=c*10+d;
			a=a/10;			
		}
		if(c==b) {
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
