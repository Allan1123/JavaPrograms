package week10day1;

public class SortArrayOwn {

	public static void main(String[] args) {
		int []a= {8,5,3,2,12,4,5,6,8};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j <a.length; j++) {
				if (a[i]>a[j]) {

					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}

			System.out.print(a[i]+",");
			
		}

	}

}
