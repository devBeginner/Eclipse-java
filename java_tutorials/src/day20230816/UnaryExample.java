package day20230816;

public class UnaryExample {
	// Unary: 단항 연산자
	
	public static void main(String[] args) {
		
		// 부호 연산자 +,-
		int num1 = -5;
		int num2 = 5;
		int result = -num1;
		System.out.println("result값:" + result);
		
		//증감 연산자 ++, --
		//증감 연산자의 위치에 따라 결과값이 다름.
		int i = 1;
		int j = i++;	//후위 연산자: 먼저 값을 연산이나, 대입 후에 마지막에 +1 증가
		System.out.println("i의 값:"+i);
		System.out.println("j의 값:"+j);
		
		int x = 1;
		int y = ++x;	//전위 연산자: 먼저 +1을 증가한 후에, 대입
		System.out.println("x의 값:"+ x);
		System.out.println("y의 값:"+ y);
				
		int k = 1;
		k++;
		++k;
		k--;
		System.out.println("k의 값:"+k);
		
		//비트반전 연산자: ~
		//정수 값을 2진수로 표현해서 각 자리 수를 반전시킵니다.
		byte b = 8; // 0000 1000 [2진수]
		System.out.println("~b의 값:" + ~b); //1111 0111[2진수]
		
		//논리 반전 연산자: !
		System.out.println(!true);
		System.out.println(!false);
		
		boolean bool = false;
		System.out.println(!bool); //true
		
		
		
		
	}

}
