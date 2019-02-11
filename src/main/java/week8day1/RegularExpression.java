package week8day1;

public class RegularExpression {

	public static void main(String[] args) {
		String a="Testleaf1234()is a company";
		String replaceAll = a.replaceAll("\\D", "");
		String replaceAll2 = replaceAll.replaceAll("\\D", "");
		System.out.println(replaceAll2);
		
//		Pattern p= Pattern.compile("[a-z A-Z0-9\\W]+");
//		Matcher matcher = p.matcher(a);
//		System.out.println(matcher.matches());

	}

}
