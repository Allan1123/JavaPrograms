package week1homework;

public class EvenNumbersLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even Number Loop:");
		for (int i = 1; i <= 100; i++) {
			int k = i % 2;
			if (k == 0) {
				System.out.println(i);
			}
		}

	}

}
