package week10day1;

public class Stringgg {

	public static void main(String[] args) {
		String a="allan";
		//int b=Integer.parseInt(a);
		//System.out.println(b);
		
		try
	    {
	      // the String to int conversion happens here
	      int b = Integer.parseInt(a.trim());
	 
	      // print out the value after the conversion
	      System.out.println("int a = " + a);
	      //System.exit(status);
	    }
	    catch (NumberFormatException nfe)
	    {
	      System.out.println("NumberFormatException: " + nfe.getMessage());
	    }
		finally {
			System.out.println("This block will get executed");
		}

	}

}
