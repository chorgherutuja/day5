package day5;

public class SumOf1To10WhileLoop {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		while (i<=10) {
			sum += i;
			i++;
		}

		System.out.println("the sum of numbers from 1 to 10 is:" + sum);
	}

}
