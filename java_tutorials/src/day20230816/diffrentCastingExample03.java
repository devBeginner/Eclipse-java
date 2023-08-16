package day20230816;

public class diffrentCastingExample03 {

	public static void main(String[] args) {
		//1. 서로 다른 데이터 타입의 연산에서 두 데이터 중 큰 타입을 가진 쪽 맞추어 자동 형변환 된 후 연산 진행
		//		최종 결과가 큰 타입에 맞추어 진행 됩니다.
		int a = 10;
		byte b = 10;;
		
		int result = a + b;
		byte result2 = (byte)(a + b);
		
		System.out.println(result);
		System.out.println(result2);

		char c = 'B';
		int i = 2;
		
		int result3 = c + i;
		System.out.println(result3);
		char result4 = (char)(c + i);
		System.out.println(result4);
		
		int j = 10;
		double d = j + 10.0;
		System.out.println(d);
		
		//2. int형보다 작은 데이터 타입의 연산을 진행할 경우에는 최종결과를 int형으로 반환합니다.
		byte b1 = 10;
		byte b2 = 5;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		short s1 = 10;
		byte s2 = 5;
		short s3 = (short)(s1 + s2);
		System.out.println(s3);
		
		// 데이터의 크기 , 숫자형의 default는 int라는 점을 기억하기!
	}

}
