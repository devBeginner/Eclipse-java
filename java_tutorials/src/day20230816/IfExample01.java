package day20230816;

public class IfExample01 {

	public static void main(String[] args) {

		int point = (int)(Math.random() * 101);
		System.out.println("점수:" + point);
		
		if(point >= 60) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		}else {
			System.out.println("불합격입니다");
			System.out.println("다시 도전하세요");
		}
	}
}
