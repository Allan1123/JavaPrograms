package week9day2;

public class StringNObject {

	public static void main(String[] args) {
		String a="Allan";
		String b="Allan";
		System.out.println(a==b);
		
		String c= new String("Allan");
		String d= new String("Allan");
		System.out.println(c.equals(d));
	}

}
