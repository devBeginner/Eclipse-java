package day20230817;

public class ForExample01 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1; i<= 10; i++) {
			
			System.out.println("안녕" + i);
			
			sum = sum + i;
			
			System.out.println("sum의 값: " + sum);
			
		}
		
		System.out.println("1~10까지의 합: " + sum);
		
	}

}
