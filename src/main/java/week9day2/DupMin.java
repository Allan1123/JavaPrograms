package week9day2;

public class DupMin {

	public static void main(String[] args) {
		int n[]= {2,4,5,1,2,3,4,5,6};
		System.out.println(getMinNum(n));
		System.out.println(getMaxNum(n));

	}
	
	public static int getMinNum(int []n) {
		int minVal=n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i]<minVal) {
				minVal=n[i];
			}
		}
		
		return minVal;	
	}
	
	public static int getMaxNum(int n[]) {
		int minVal=n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i]>minVal) {
				minVal=n[i];
			}
		}
		return minVal;
	}

}
