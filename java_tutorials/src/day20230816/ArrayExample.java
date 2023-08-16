package day20230816;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		//배열은 선언, 생성, 초기화 과정으로 이루어 집니다.
		//1.배열의 선언
		int[] arr;
		
		//2.배열의 생성
		arr = new int[5];
		System.out.println(arr);
		
		//3. 배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//4. 배열의 사용
		System.out.println("배열의 두번째 값:" + arr[1] );
		arr[1] = 100;
		System.out.println("배열의 두번쨰 값:" + arr[1]);
		
		//5. 배열의 생김새 한눈에 문자열 형태로 보여주는 기능
		System.out.println( Arrays.toString(arr) );
		
		//6. 배열의 길이
		System.out.println("배열의 길이:" + arr.length);
		
		//7. 배열의 선언과 생성을 동시에 하는방법
		byte[] arr2 = new byte[7];
		
		//8. 배열의 선언과 생성과 초기화 동시에 하는방법
		char[] arr3 = {'A', 'B', 'C', 'D'};
		System.out.println( Arrays.toString(arr3) );
		
		//9. 배열의 초기값을 지정하지 않는다면 기본값으로 자동 초기화
		System.out.println( Arrays.toString(arr2));
		
		
		
		
		
		
		
	}

}
