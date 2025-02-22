package day5;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner mango = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = mango.nextInt();

        int sum = 0;
        while (num != 0) {
            sum += num % 10; 
            num /= 10;    
        }

        System.out.println("The sum of digits is: " + sum);
	}

}
