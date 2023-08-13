package day20230810;

public class VarScope {

	public static void main(String[] args) {
		/* 
		 * 변수는 중괄호 안에서 선언되고
		 * 중괄호 안에서만 유효합니다.
		 */
		//int num1 = 10;
		//int num2 = 20;
		int num1 = 10, num2 = 20, num3 = 30;
		int num6 = 1;
		
		if(num1 > 5) {
			int num4 = 1;
			int num5 = num1 + num2 + num3;
			
			num6 = 100;
		}
		
		//System.out.println(num4); 중괄호 밖:오류
		//System.out.println(num5); 붕괄호 밖:오류
		System.out.println(num6); //100
		
		
	}

}
