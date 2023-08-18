package day20230818;

public class MethodExample01 {
		

	public static void main(String[] args) {

		System.out.println("1~100까지의 합:" + calSum());
		
		
		String result = random();
		System.out.println(result);
	
	}	
	//Method의 형태 : Type Name ( PARAMETERS )
	
	static int calSum() {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String random() {
		
		return "안녕하세요";
	}
	
	
}
