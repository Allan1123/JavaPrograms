package week2day4;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int Add,Sub,Mul,Div,
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		System.out.println("Enter the Arithmetic Operation Add,Sub,Mul,Div:");
		String ArthMath = sc.next();
		switch (ArthMath) {
		case "Add":
			int Add = a + b;
			System.out.println("The Addition of two numbers is:" + Add);
			break;

		case "Sub":
			int Sub = a - b;
			System.out.println("The Subtraction of twp numbers is:" + Sub);
			break;

		case "Mul":
			int Mul = a * b;
			System.out.println("The Multiplication of twp numbers is:" + Mul);
			break;

		case "Div":
			int Div = a / b;
			System.out.println("The Division of twp numbers is:" + Div);
			break;

		}

	}

}
