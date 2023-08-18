package day20230818;

public class ContiueExample01 {

	public static void main(String[] args) {
		
		
		//continue : 반복문의 맨 처음으로 제어가 이동
		//continue 이후 실행문은 실행되지 않음.
		
		
		/*
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				continue;
				
			}
			
			System.out.println(i);
			
		}
		*/
		
		int i = 1;
		while(i <= 10) {
			
			
			
			if(i == 5) {
				i++;
				continue;
			}			
			System.out.println(i);
			i++;
			
		}
		
	}

}
