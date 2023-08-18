package day20230818;

public class MethodExample02 {

	public static void main(String[] args) {
		
		System.out.println(calsum(10));		
		System.out.println(calsum(20));
		System.out.println(calsum(30));
		
		int result = calsum2(10, 20);
		System.out.println(result);
		System.out.println(calsum2(10,20));
		
	}

	static int calsum(int end) {
	
	 int sum = 0;
	 for(int i = 1; i <= end; i++) {
		 sum += i;
	 }
	
	 return sum;
	
	}
	
	static int calsum2(int a, int b) {
		
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		
		
		return sum;
	}
	
	
	
	
}
