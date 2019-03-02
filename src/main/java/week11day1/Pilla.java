package week11day1;

import java.util.Scanner;

public class Pilla {

	public static void main(String[] args) {
		System.out.println("Enter which fish do you need");
		System.out.println("1) Vanjiram");
		System.out.println("2) Nethili");
		System.out.println("3) Chala");
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		String fish = sc.nextLine();
		
		if(fish.equals("1")) {
			System.out.println("Allan likes it");
		}
		else if (fish.equals("2")) {
			System.out.println("Chellam likes it");
		}
		else {
			System.out.println("Mama likes it");
		}
	}

}
