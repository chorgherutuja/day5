package day5;

public class EvenOddWhileLoop {

	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		int i = 1 ;
		
		while(i<=30) {
			if(i % 2 == 0) {
				sumEven += i;
			}else {
				if(i % 2 == 0) {
					sumOdd += i ;
				}
			}
			i++;
		}
		
		System.out.println("the sum of even numbers from 1 to 30 is:" + sumEven);
		System.out.println("the sum of odd numbers from 1 to 30 is:" + sumOdd);
	}
}
