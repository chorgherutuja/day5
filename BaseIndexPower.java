package day5;

import java.util.Scanner;

public class BaseIndexPower {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent (index): ");
        int exponent = scanner.nextInt();

        long result = 1; 

        for (int i = 1; i <= exponent; i++) {
            result *= base; 
        }

        System.out.println(base + "^" + exponent + " = " + result);

	}

}
