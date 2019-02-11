package week10day1;

public class StringProblem {

	public static void main(String[] args) {
		String a="Allan is good boy121212@@";
//		String substring = a.substring(0, 2);
//		System.out.println(substring);
		a=a.replaceAll("\\d", "");
		String replaceAll = a.replaceAll("\\W", "");

		System.out.println(replaceAll);
		

	}

}
