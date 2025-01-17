package j0117;

public class Ja0117_01 {

	public static void main(String[] args) {
		// 객체
		// 객체지향언어
		// 
		// 클래스 - 객체를 정의 해놓은 것
		// 클래스 용도 - 객체를 생성하는데 사용 (설계도 같은 것)

		// 객체는 인스턴스라고도 함.(거의 비슷한 개념)
		// 객체 - 다른 곳에서 클래스를 사용할때 객체 선언.
		// 객체는 속성과 기능으로 이루어져 있다.
		// 속성 - 변수 / 기능 - 메서드
		
		// 인스턴스 생성방법
		// 클래스명 참조변수명;
		// 참조변수명 = new 클래스명();
		
//		int[] arr = new int[5];
//		arr[0] = 1;
		
		
		Tv t1 = new Tv();
//		String color = "red";
		t1.color = "red";
		t1.power = false;
		t1.channel = 7;
		// 참조변수.변수명 = ""
		
		t1.power();
		t1.channelUp();
		
		System.out.println("현재 채널 : "+t1.channel);
		
		
		
		
		
		
		
		
		
		
	}

}
