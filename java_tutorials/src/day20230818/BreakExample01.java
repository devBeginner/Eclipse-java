package day20230818;

import java.util.Scanner;

public class BreakExample01 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		int i = 1;
		while(true) {
			
			System.out.println("----------------------");
			System.out.println("15 x 6 = ? ");
			System.out.println(">");
			
			int answer = scan.nextInt();
			
			if(answer == 90) {
				System.out.println("정답입니다");
				break;
			}else {
				System.out.println("오답입니다");
			}
			
			
			i++;
		}
		
		
	}

}
