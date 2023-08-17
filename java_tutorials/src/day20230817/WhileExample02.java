package day20230817;

import java.util.Scanner;

public class WhileExample02 {

	public static void main(String[] args) {

		//정수를 입력받아서 소수인지 판별.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력>" );
		int num = scan.nextInt();
		
		int a = 2; //소수판별을 위해 나누어볼 제어변수
		while( num % a !=0 ) {
			
			a++;
		}
		
		if( num == a) {
			System.out.println(num + "은 소수입니다");
		}else {
			System.out.println(num + "은 소수가 아닙니다");
		}
		
		
		
	}

}
