package day5;

public class SumOfEvenWhileLoop {

	public static void main(String[] args) {

		int sum = 0;
		int num = 2;
		
		while(num <= 10) {
			sum += num;
			num += 2;
		}

		System.out.println("The sum of even numbers from 1 to 10 is:" + sum);
	}

}
