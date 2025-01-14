package j0113;

public class Ja0113_04 {

	public static void main(String[] args) {
		// 문자 - g 저장해서 출력
		char ch = 'g';
		System.out.println(ch);
			
		// 문자열 - 안녕하세요. 출력
		String str = "안녕하세요.";
		System.out.println(str);
		
		String str1 = new String("안녕!");
		System.out.println(str1);
		
		// 숫자 - 10000 입력해서 출력
		int num = 10000;
		System.out.println(num);
		
		// 변수 
		// 대소문자 구분 True -> 변수 / true -> 참(예약어)
		// 변수명으로 숫자가 처음에 나올 수 없음
		// 변수명으로 특수문자 사용불가 ( _, $ 는 사용 가능)
		
		// 클래스 이름의 첫글자는 대문자로 한다. 변수와 메서드 첫글자는 소문자
		
		// 상수의 이름은 모두 대문자로 한다.
		int pi = 3;
		pi = 10;
		pi = 100;
		
		final int PI = 3; // final 붙으면 상수 -> 값 변경이 안됨.
		// PI = 500;
		
		//
		
		

	}

}
