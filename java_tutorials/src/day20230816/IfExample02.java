package day20230816;

import java.util.Scanner;

public class IfExample02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력>");
		int point = scan.nextInt();
		
		if (point >= 90) {
			System.out.println("축하드립니다");
			
			if(point >= 95) {
			System.out.println("A+학점 입니다");	
			}else {
			System.out.println("A학점 입니다");
			}
		}else if(point >= 80) {
			System.out.println("B학점 입니다");
		}else if(point >= 70) {
			System.out.println("C학점 입니다");
		}else {
			System.out.println("F학점 입니다");
		}
		
	
	}

}
