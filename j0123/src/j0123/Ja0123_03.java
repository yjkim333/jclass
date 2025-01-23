package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		
		// 프로그램 오류
		// 컴파일 에러 - 컴파일할 때 발생
//		System.out.prin(); // 오타 : 컴파일 에러
		
		// 런타임 에러 - 실행할 때 발생
//		Scanner scan = new Scanner(System.in);
//		int[] n = new int[3];
//		for(int i=0;i<4;i++) {
//			System.out.println("숫자를 입력하세요.");
//			n[i] = scan.nextInt();
//		}
		
		
		// ------------------------------------------------------
		
		// 예외 처리 - try-catch문
		// 외부와 연결되는 부분들에는 의무적으로. - db연결, 프린트, 파일다운...
		
		// try{
		
		// } catch {
		
		// } catch {
		
		// } finally{
			// 에러 유무와 상관 없이 무조건 돈다. try->finally 순
		// }
		
		System.out.println(1);
		System.out.println(2);
		try {
			// 정상적으로 돌아가는 프로그램 구현
			System.out.println(3);
//			System.out.println(3/0); // 에러 발생
			System.out.println(4);
			throw new Exception("고의 에러"); // 고의 에러 발생
		} catch (Exception e) {
			// 에러가 났을 때 실행되는 부분
			System.out.println(e.getMessage()); // 고의 에러 메세지
			e.printStackTrace(); // 에러가 났을때 에러위치, 에러 설명
			System.out.println("에러발생 3-1");
			System.out.println("에러발생 4-1");
		}		
		System.out.println(5);
		System.out.println(6);
		
		
		
		
		
		
	}

}
