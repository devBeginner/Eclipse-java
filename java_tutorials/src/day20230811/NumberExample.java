package day20230811;

public class NumberExample {

	public static void main(String[] args) {

		byte a = 127; // -128~127
		short b = 32767;
		int c = 2147483647;
		long d = 2147483648L;
					
		System.out.println(d);
		
		//2진수를 저장할 때는 정수 앞에 0b를 붙임
		int bin = 0b1010;
		System.out.println("2진수 1010:" + bin);
		
		//8진수를 저장할 때는 정수 앞에 0을 붙임
		int octa = 064;
		System.out.println("8진수 064:" + octa);
		
		//16진수를 저장할 때는 0x를 붙임
		int hexa = 0x3a4c;   //a=10,b=11,c=12,...
		System.out.println("16진수 0x3a4c:" + hexa);
		
		System.out.println("---------------------");
		float f1 = 3.14f;
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 1.234567891234f;
		double d2 = 1.234567891234;
				
		System.out.println(f2);
		System.out.println(d2);
		
		
		
	}
}
