package week6day1;

public class UniqueCharacters {

	public static void main(String args[]) {
		String input="Hello Boss how are you";
		String output="";
		char b[]=input.toLowerCase().replace(" ", "").toCharArray();
		System.out.println("Input:"+input);

		for (int i=0;i<b.length;i++) {
			if(output.indexOf(b[i]) == -1) {
				output = output + b[i];
			}
		}
		System.out.println("Output:"+output);
	}

}

