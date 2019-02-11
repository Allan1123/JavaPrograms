package week9day3;

public class SpecialCharacters {

	public static void main(String[] args) {
		String a="{Java}/\\*(Selenium)";
		String replace = a.replaceAll("\\W", "");
		//String replace = a.replaceAll("[\\{}\\/\\*()]", "");
		System.out.print(replace);

	}

}
