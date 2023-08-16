package day20230816;

import java.util.Scanner;

public class SwitchExample01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력>");
		int point = scan.nextInt();
		
		
		//switch구문의 소괄호 안에는 변수나, 변수의 연산이 들어갈 수 있습니다.
		switch (point / 10) {
		case 9:
			
			System.out.println("축하드립니다");
			
			if(point >= 95) {
				System.out.println("A+ 학점입니다");
			}else {
				System.out.println("A 학점입니다");
			}
			
			break;
		case 8:
			System.out.println("B 학점입니다");
			break;
		case 7:
			System.out.println("C 학점입니다");
			break;

		default: 
			System.out.println("F 학점입니다");
			break;

		}
			
	}

}
