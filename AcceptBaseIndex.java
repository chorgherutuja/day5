package day5;

import java.util.Scanner;

public class AcceptBaseIndex {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the base: ");
	        double base = scanner.nextDouble();

	        System.out.print("Enter the exponent (index): ");
	        double exponent = scanner.nextDouble();

	        double result = Math.pow(base, exponent);

	        System.out.println(base + "^" + exponent + " = " + result);

	}

}
