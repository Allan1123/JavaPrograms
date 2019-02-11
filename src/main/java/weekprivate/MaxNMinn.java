package weekprivate;

public class MaxNMinn {

	public static void main(String[] args) {
		int number[]= {1,2,3,1,2,3,4,5,5,6};
		System.out.println(getMaxNumber(number));
		
		//getMaxNumber(number);
	}
	
	public static int getMaxNumber(int [] number) {
		int maxNum=number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i]>maxNum) {
				maxNum=number[i];
			}
		}
		
		return maxNum;
		
		
	}

}
