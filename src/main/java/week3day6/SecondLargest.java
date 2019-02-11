package week3day6;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] numbers = { -22, -22, -10, -34, -76, -888, -21, -97, -432, -16, 1000, -1001 };
		Arrays.sort(numbers);
		System.out.println("The second largest number is: " + numbers[numbers.length - 2]);

	}

}
