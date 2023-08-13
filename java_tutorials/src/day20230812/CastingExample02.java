package day20230812;

public class CastingExample02 {

	public static void main(String[] args) {
			//반대로 큰타입을 작은타입에 형변환
		
		int i = 65;
		char c = (char)i;
		System.out.println("65의 유니코드 문자값:" + c);
		
		double d = 3.14;
		int j = (int)d;
		System.out.println(j);
		
		/*
		 * 강제타입변환을 사용할 때 주의할 점은
		 * 해당 데이터 타입을 받아들일 수 없는 범위의 값이
		 * 들어오면 임의의 값을 저장합니다.
		 */
		int k = 1000;
		byte b = (byte)k;
		System.out.println(b);
		
		
	}

}
