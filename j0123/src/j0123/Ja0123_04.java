package j0123;

public class Ja0123_04 {

	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		System.out.println(1);
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println("프로그램 종료");
		
	}
	
	static void method1() throws Exception { 
		// method1() throws Exception => 에러 발생 시 메서드호출 부분으로 보냄.-> 호출 부분에 try-catch문 써야함.
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0); // 에러발생
		System.out.println(4);
		System.out.println(5);
		System.out.println("finally - 무조건 실행");
		System.out.println(6);
//		try {
//			System.out.println(3);
//			System.out.println(4/0); // 에러발생
//			System.out.println(4);
//		} catch (Exception e) {
//			System.out.println(5);
//		} finally {
//			System.out.println("finally - 무조건 실행");
//		}
//		System.out.println(6);
	}

}
