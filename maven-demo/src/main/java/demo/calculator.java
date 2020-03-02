package demo;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MathOperations mp = new MathOperations();
		System.out.println("Enter two numbers to perform mathoperations");
		double n1 = s.nextInt();
		double n2 = s.nextInt();
		System.out.println("Select the operations need to be done from --> +,-,*,/");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Substraction");
		System.out.println( "Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		int option = s.nextInt();
		switch(option){
		case 1:
			System.out.println("Answer is : " + mp.add(n1, n2));
			break;
		case 2:
			System.out.println("Answer is : " + mp.substract(n1, n2));
			break;
		case 3:
			System.out.println("Answer is : " + mp.multiply(n1, n2));
			break;
		case 4:
			System.out.println("Answer is : " + mp.divide(n1, n2));
			break;
		default:
			System.out.println("Invalid option entered");
			
		}
	}

}


