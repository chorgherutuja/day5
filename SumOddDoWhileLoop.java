package day5;

public class SumOddDoWhileLoop {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		do {
			sum += num;
			num += 2;
		}while(num <= 10);

		System.out.println("The sum of odd numbers from 1 to 10 is:" +sum);
	}

}
