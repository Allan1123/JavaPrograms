package week10day1;

public class CountVowels {

	public static void main(String[] args) {
		int vowels=0,consonants=0;
		String a="this is bad sentence";
		a = a.toLowerCase();
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else if (ch>='a'&&ch<='z') {
			consonants++;	
			}
		}
		System.out.println("The vowels are: "+vowels);
		System.out.println("The consonants are: "+consonants);
	}
	
	

}
