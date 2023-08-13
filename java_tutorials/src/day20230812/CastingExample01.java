package day20230812;

public class CastingExample01 {	//형변환

	public static void main(String[] args) {

	/*	byte(1) < short(2) = char(2) < int(4)
	 *   < long(8) < float(4) < double(8)
	 *   
	 *   float은 4바이트인데 long보다 큰 타입인 이유는
	 *   표현할 수 있는 값의 경우의 수가 float이
	 *   더 크기 때문입니다.	 
	 */   
		byte b = 10;
		int i = b; //byte -> int형으로 자동 형 변환
		System.out.println(i);
		
		
		short s = 20;
		int i2 = s; //short -> int형으로 자동 형 변환
		
		int k = 500; //int -> double형으로 자동 형 변환
		double d = k;
		System.out.println(d);
		
		char c = '가';
		int j = c;
		System.out.println("'가'의 유니코드:" + j);
		
		
		
		
	}

}
