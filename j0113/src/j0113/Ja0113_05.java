package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = '\u0041';  // 아스키코드 16진수 표기 16*4 + 1*1 = 64 + 1 = 65 = A
		System.out.println(ch2);
		
		char ch3 = 97; // 97 = a
		System.out.println(ch3);
		
		char ch4 = '\t';
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		// print println 차이
		
		
		// boolean - true, false
		// char - '' 표시 / 아스키 코드값 - 65='A', 97='a', 48='0'
		// 정수형 - byte, short - 거의 사용 안함 / int - 기본형 정수 그냥 값 입력하면 됨
		// 정수형 - long : 접미사 L을 붙여야 함.
		// 실수형 - float : 접미사 F 일부러 다 붙임
		// 실수형 - double : 기본형 실수 - 접미사 D 생략 가능 일부러 다 생략
		
		
		boolean p = true;
		boolean p2 = false;
		
		long l = 10000000000L;
		//long 에는 뒤에 L을 붙인다. 21억 보다 큰 수는 L을 붙인다
		
		float f = 3.14F;
		float f2 = 100; // 100.0으로 출력
		float f3 = 100.0F;
		float f4 = 100F;
		
		double d = 3.14;
		double d2 = 3.14D; // D생략가능
		
	}

}
