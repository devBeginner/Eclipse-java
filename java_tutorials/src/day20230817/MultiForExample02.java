package day20230817;

public class MultiForExample02 {

	public static void main(String[] args) {

		
		//구구단 만들기
		for(int i = 2; i <= 9; i++){
			System.out.println("구구단 " + i + "단 입니다");
			
			
			for(int j = 1; j <= 9; j++){
				System.out.println(i +"x" + j + "=" + i*j);
			}
			
			System.out.println("-------------------------------------");
					
		}
		
	}

}
