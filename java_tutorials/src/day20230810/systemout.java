package day20230810;

public class systemout {

	public static void main(String[] args) {
		
		//자바의 출력문은 3가지가 있습니다.
		// 줄바꿈을 포함하지 않는 print()
		System.out.print("hello \n" );
		System.out.print("프린트 메서드는 줄바꿈이 없습니다 \n");

		//자동으로 줄바꿈을 포함해주는 println()
		System.out.println("2");
		System.out.println(2);
		
		//형식지정 출력문 printf()
		System.out.printf("오늘은 %d월 %d일 입니다 \n", 1, 30);
		System.out.printf("%s 하세요", "안녕");
		/* 서식문자
		 * %d 정수를 입력받음
		 * %f 실수를 입력받음
		 * %s 문자열 입력받음
		 * %c 문자 입력받음
		 */
		
	}
}
