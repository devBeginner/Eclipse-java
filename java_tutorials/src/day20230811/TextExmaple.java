package day20230811;

public class TextExmaple {

	public static void main(String[] args) {
		
		//단일 저장하는 데이터 타입 char [2byte]
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		//전세계 문자를 표현하는 유니코드 2byte = 65536가지의 문자값
		char c3 = '가';
		char c4 = 44032;
		System.out.println(c3 + "" + c4);
		
		//문자열 string 
		String s1 = "my name is ";
		String s2 = "park";
		
		System.out.println(s1 + s2);
		
		//문자와 다른 데이터 타입의 +연산 : 문자열에 다른 변수가 붙는다면 최종결과는 문자열
		System.out.println(100 + 200);
		System.out.println("100" + 200);
		System.out.println(100 + 200 + "300");
		
		//git hub 배우기
		
		
		
		
		
	}

}
