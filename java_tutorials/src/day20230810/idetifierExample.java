package day20230810;

public class idetifierExample {

	public static void main(String[] args) {
		//클래스 이름 규칙
		//클래스의 첫글자는 대문자로 표기
		//연결된 단어의 첫글자도 대문자로 표기
		
		//식별자는 대소문자를 구분한다.
		int age = 10;
		int Age = 20;
		int aGe = 30;
		
		System.out.println(age);
		System.out.println(Age);
		System.out.println(aGe);
		
		//변수의 이름은 소문자로 시작하고, 연결되는 단어는 대문자로 표기(카멜표기법)
		//식별자 이름은 숫자로 시작할 수 없음, 공백을 사용할 수 없음
//		int 4num = 10;    // ctrl+/ : 빠른주석처리
		int num4 = 10;
		
//		int phone number = 10;
		int phoneNumber = 10;
		
		//식별이름으로 자바의 키워드를 사용할 수 없음.
//		int class = 10;
	
	}
}
