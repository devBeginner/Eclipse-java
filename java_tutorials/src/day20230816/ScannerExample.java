package day20230816;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		// 1. 스캐너 기능 생성.
		Scanner scan = new Scanner(System.in);
		
		// 2. 스캐너가 가지고 있는 기능을 통해서 데이터를 입력받음.
		System.out.println("자기소개>");
		String intro = scan.nextLine(); // 공백을 포함하는 문자열 받음
		
		System.out.println("이름>");
		String name = scan.next(); // 공백을 포함하지 않는 문자열 받음
		
		System.out.println("나이>");
		int age = scan.nextInt();
		
		System.out.println("자기소개:" + intro);
		System.out.println("이름:" + name + ", 나이:" + age);
		
		//3. 스캐너 기능 종료
		scan.close();
		
		
		
	}

}
