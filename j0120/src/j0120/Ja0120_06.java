package j0120;

public class Ja0120_06 {

	public static void main(String[] args) {
//		int total = 1;
//		for(int i=1;i<=5;i++) {
//			total = total*i;
//		}
//		
//		System.out.println(total);

		System.out.println(fac(5));
	
	}
	
	static long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n*fac(n-1);
		}
		return result;
	}
	
	
	long fac() {
		return 1;
	}
	
	
	// 메서드 오버로딩 : 하나의 클래스에 같은 이름의 메서드를 여러개 사용하는 것
	// 조건 =>
	// 메서드 이름이 같아야 한다.
	// 매게번수의 개수 또는 타입이 달라야한다.
	// 리턴타입은 상관없음
	
	// 변수 - 클래스변수(객체선언없이 클래스명.변수명), 인스턴스변수(객체선언후 참조변수명.변수명), 지역변수(메서드내. 객체선언 후)
	// 메서드 - 클래스메서드(객체선언없이 클래스명.메서드명), 인스턴스메서드(객체선언후 참조변수명.메서드명)

}
