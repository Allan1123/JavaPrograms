package week9day2;

public class MaxnMinn {

	public static void main(String[] args) {
		
		int numbers[]= {11,2,4,5,8,9,20,17,5};
		System.out.println("MAXIMUM:"+getMaxValue(numbers));
		System.out.println("Minimum"+getMinValue(numbers));

	}
	
	public static int getMaxValue(int[] numbers){
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
			  maxValue = numbers[i];
			}
		  }
		  return maxValue;
		}

		public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
			  minValue = numbers[i];
			}
		  }
		  return minValue;
		}

}
