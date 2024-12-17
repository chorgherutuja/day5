package day5;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sumEven = 0;
			int sumOdd = 0;
			
			for(int i=1; i<=30; i++) {
				if(i % 2 == 0) {
					sumEven += i;
				}else {
					sumOdd += i;
				}
			}
			System.out.println("Sum of even numbers between 1 to 30:" + sumEven);
			System.out.println("Sum of odd numbers between 1 to 30:" + sumOdd);
		}

}
