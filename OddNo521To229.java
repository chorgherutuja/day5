package day5;

public class OddNo521To229 {

	public static void main(String[] args) {
	
		int num = 521;
		
		while(num >= 229) {
			if(num %2 != 0) {
				System.out.println(num);
			}
			num--;
		}

	}

}
