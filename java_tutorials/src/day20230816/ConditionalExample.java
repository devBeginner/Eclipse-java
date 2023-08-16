package day20230816;

public class ConditionalExample {

	public static void main(String[] args) {
		
		//랜덤한 실수 값을 발생시키는 기능 : Math.random()
		System.out.println(Math.random()); // 0이상~1.0미만의 랜덤한 실수값
		
		int result = (int)(Math.random()*10)+1; // 1~10 사이의 랜덤 int값 출력
		System.out.println(result);
		
		
		//삼항 연산자
		String str = result % 2 == 0 ? "짝수" : "홀수" ;
		System.out.println(str);
		
		
	}

}
