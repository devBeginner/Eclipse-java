package day20230818;

public class BreakExample02 {

	public static void main(String[] args) {

		
		//중첩 반복문에서의 break [ex)orange]
		
		orange: for(char u = 'A'; u <= 'z'; u++) {
			
			for(char l = 'a'; 1 <= 'z'; l++) {
				
				System.out.println(u + "-" + l);
				
				if(l == 'c') {
					break orange;
					
				}
							
			}
			
		}
		
	
		
	}

}
