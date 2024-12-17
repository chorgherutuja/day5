package day5;

public class SumOfOddWhileLoop {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		while(num <= 10) {
			if(num %2 != 0) {
				sum += num;	
		}
			num++;
	}

		System.out.println("The sum of even numbers from 1 to 10 is:" + sum);
	}
}
