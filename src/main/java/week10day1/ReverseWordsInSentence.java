package week10day1;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String a = "Allan is a good boy";
		String[] split=a.split(" ");
		String result="";
		for (int i = split.length-1; i >= 0; i--) {
			result=result+(split[i]+" ");
		}
		System.out.println(result.trim());
	}

}
