package day20230816;

public class BinaryExample01 {

	public static void main(String[] args) {
		
		//수치연산 [/:몫 , %:나머지]
		int k = 7 * 3;
		int i = 7 / 3;  //몫:2
		int j = 7 % 3;  //나머지:1
		
		//비교연산
		System.out.println(i == j);
		System.out.println(i >= j);
		System.out.println(20 > j);
		System.out.println(j != 1);
		
		int x = 20;
		int y = 30;
		boolean bool = x != y;
		System.out.println(bool);
		
		//비트 연산자
		byte a = 5; //0000 0101
		byte b = 3; //0000 0011
		
		System.out.println(a & b); //0000 0001 [&: 둘다 1일때만 1출력]
		System.out.println(a | b); //0000 0111 [|:하나라도 1이면 1출력]
		System.out.println(a ^ b); //0000 0110 [^:같으면 0출력,다르면 1출력]
		
		
		//비트 쉬프트 연산자 >> , <<
		int i2 = 192; // 1100 0000
		System.out.println(i2 >> 2); // 0011 0000
		
		
		
	}

}
