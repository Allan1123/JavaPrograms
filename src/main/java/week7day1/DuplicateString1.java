package week7day1;

public class DuplicateString1 {

	public static void main(String[] args) {
	    String str = "google";
	    char[] charArray = str.toCharArray();
	    int count=0;
	    int length = str.length();
	    for(int i=0;i<length;i++) {
	    	int j;
	    	for(j=0;j<length;j++) {
	    		if(charArray[i]==charArray[j])
	    		break;
	    	if(i==j) {
	    		charArray[count++]=charArray[i];
	    	}
	    	}
	    	System.out.print(charArray[j]);
	    }
	    
	}
}