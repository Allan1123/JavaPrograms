package week10day1;

public class AmstrongNumbers {

	public static void main(String[] args) {
		int a=371,b,c=0,d;
		b=a;
		while(a>0) {
			d=a%10;
			//c=c*10+d;
			c=c+(d*d*d);
			a=a/10;
		}

		if (b==c) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not an Amstrong Number");
		}
	}

}
