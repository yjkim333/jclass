package j0117;

import java.util.Scanner;

public class Ja0117_09 {
	// 파이썬 def add():
	//			return
	// 메서드 - 작업을 수행하기 위한 명령문의 집합
	//		- 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.(입력 받는 값이 없을 수도 있고 결과를 돌려주지 않을 수도 있다.)
	
	// 메서드 정의 - 클래스 영역에만 정의할 수 있음. 메서드 안에 메서드 불가.
	// 메서드 선언 - 리턴타입 메서드이름(매개변수)
	// 		    - 반환값이 없는경우 void
	
	// 메서드
//	int add(int a,int b) {
//		int result = a+b;
//		return result;
//	}
//	
//	boolean power; // 인스턴스변수 - 객체선언 후 참조변수명.변수명
//	void power() {
//		power = !power;
//	}
	
	// 메서드
	public static void main(String[] args) {
//		int a = 0; // 지역변수
//		Ja0117_09 j = new Ja0117_09();
//		j.power = true;
//		System.out.println(j.power);
	
		// 메서드 호출방법
		// 참조변수.메서드 이름()
//		Cal c = new Cal();
//		
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		c.add(num, num2);
//		System.out.println("더하기 : "+result);
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : "+result2);
//		
//		c.mult(num, num2);
		
		
		
		// 2개의 값을 넘겨주면
		// 메서드 3개
		// a,b -> a와 b에 각각 10을 더한 뒤 두 수를 더한 후 리턴
		// a,b -> a와 b에 각각 10을 곱한 뒤 두 수를 더한 후 리턴
		// a,b -> a*b
		Scanner scan = new Scanner(System.in);
		
		Cal2 c = new Cal2();
		while(true) {
			System.out.println("숫자1을 입력하세요.");
			int num = scan.nextInt();
			// -1 입력하면 프로그램 종료
			if(num==-1) {
				System.out.println("프로그램 종료");
				break;
			}
			int num2 = scan.nextInt();
			int result = c.first(num, num2);
			System.out.println(result);
			
			int result2 = c.second(num, num2);
			System.out.println(result2);
			
			int result3 = c.multi(num, num2);
			System.out.println(result3);
			System.out.println();
		}
		
		// 기본형 매개변수(->일반변수)와 참조형 매개변수
		// 기본형 매개변수 - 변수의 값을 읽기만 할 수 있음.
		// 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있음. (주소값만 전달)
		
		
		
		
		
	}

}
