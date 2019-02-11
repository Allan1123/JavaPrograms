package week1homework;

public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int count = 0;
		while (count <= 20) {
			int k = i % 5;
			if (k == 0) {
				count = count + 1;
				System.out.println(i);
			}
			i++;
		}

	}

}
