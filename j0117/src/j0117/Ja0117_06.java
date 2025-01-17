package j0117;

public class Ja0117_06 {

		static int c = 0;	 	// 1. 클래스 변수 - 프로그램이 실행 되면 사용 가능
		int num = 10; 			// 2. 인스턴스 변수 - 객체 선언을 해야 사용 가능
	
	public static void main(String[] args) {
		
//		int a = 5; 				// 3. 지역 변수 - 객체 선언을 해야 사용 가능
		
		// 변수
		// 클래스 아래에 있는 변수
		// 1.클래스변수(static변수, 공유변수) - static이 앞에 붙어있는 변수 => 실행되자 마자 변수 생성
		// 2.인스턴스변수 - 인스턴스변수 => new~ 인스턴스 생성 시 변수 생성
		// 메서드 안에 있는 변수
		// 3.지역변수 - 메서드 안에 선언된 변수 => new~ 변수 선언문 수행 시 생성
		
//		// 1-100까지 합을 구하시오.
//		// 합이 200을 넘는 시점의 i 값 출력
//		int sum = 0;
//		int k = 0;
//		int sum2 = 0;
//		int k2 = 0;
//		for (int i=1;i<101;i++) {
//			sum += i;
//			if(sum>200) {
//				k = i;
//				k2 = i-1;
//				sum2 = sum-i;
//				break;
//			}
//		}
//		// 200이 넘는 시점 전 단계 ---------
//		System.out.println(k2);
//		System.out.println(sum2);
//		
//		// 200이 넘는 시점 ---------
//		System.out.println(k);
//		System.out.println(sum);
		
		
		// 클래스변수 사용  클래스명.변수명
		Stu.count = 1;
		System.out.println(Stu.count);
		
		
		
		
		
		
		
		
		
		
	}

}
