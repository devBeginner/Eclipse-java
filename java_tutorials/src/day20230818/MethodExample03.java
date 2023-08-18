package day20230818;

public class MethodExample03 {

	
	public static void main(String[] args) {
		
	 int result = add(1, 3);
	 System.out.println(result);
	 
	 int result2 = add ( add(1, 2) , add(3, 4) );
	 System.out.println(result2);
	 
	 // void method는 반환이 안됨 >>[불가능]>> int result3 = multi(10, 20);
	 //[불가능] System.out.println(multi(10, 20));
	 multi(10, 20); // void형 메서드는 단순히 호출만 가능합니다.
	 sub();
	 
	}

	static int add(int a, int b) {
		return a + b;
	}
		
	static void multi(int a, int b) {
		System.out.println(a + "x" + b + " = " + a*b );
	}
	
	static void sub() {
		System.out.println("2 - 1 = 1");
	}
	
	static void print() {
		
		return;	// [void형에서만의 특징] 메서드 종료의 의미
	}
	
	
	
	
	
}
