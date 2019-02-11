package week5day2;

class StringReverse
{
	/* Function to print reverse of the passed string */
	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{
		String str = "This is greek god fitness";
		StringReverse obj = new StringReverse();
		obj.reverse(str);
	} 
}

