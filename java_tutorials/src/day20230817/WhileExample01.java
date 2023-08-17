package day20230817;

public class WhileExample01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int a = 1; // 제어변수: 반복문의 반복횟수를 제어할 변수
		
		
		while( a <= 10 ) {
			
			
			sum = sum + a;
			System.out.println(" 안녕하세요 " + a);
			
			a++; // 증감식
		}
		
		System.out.println("1~10까지의 합: " + sum);
		System.out.println(a);
		
		
		
		
		
		
	}

}
