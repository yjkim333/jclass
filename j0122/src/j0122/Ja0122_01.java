package j0122;

import stu.Shape;

public class Ja0122_01 {

	public static void main(String[] args) {
		// 클래스 - 설계도
		// 객체 - 제품 -> 변수, 메서드로 이루어진 것
		// 변수 - 클래스변수, 인스턴스변수, 지역변수
		// 메서드 - 클래스메서드, 인스턴스메서드
		// 메서드 오버로딩 - 메서드 이름이 같고, 매개변수의 타입이나 개수가 다른 메서드
		// 상속 - 클래스의 재사용 => extends 부모클래스
		// 오버라이딩 - 상속시 부모의 메서드를 상속받는 클래스의 조건에 맞게 재정의
		// 패키지 - 폴더, 클래스의 묶음
		// import - 패키지 이름 생략가능하게
		
		// 제어자
		// 그외 제어자 - static, final, abstract ...
		// 접근제어자 - 외부로부터의 접근을 제한 - public, protected, default, private
		// private - 같은 클래스 내에서만 접근 가능
		// default - 같은 패키지 내에서만 접근 가능
		// protected - 같은 패키지 내에서, 그리고 다른패키지의 자손클래스에서 접근 가능
		// public - 접근 제한 없음
		// 클래스에는 public, default 만 넣을 수 있음
		// 변수에는 4가지 모두 가능
		
		// 접근제어자를 이용한 캡슐화
		// 외부로부터 데이터를 보호하기 위해서
		// 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서.
		
//		Car c = new Car();
//		System.out.println(c.getColor());
//		Car c2 = new Car("white","auto",4);
//		System.out.println(c2.getColor());
//		c2.setDoor(8);
//		System.out.println(c2.getDoor());
//		
//		Shape s = new Shape();
		
		
		Time t1 = new Time(12,05,10);
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+1);
		System.out.println(t1.getHour());
		
		// 17,35,30 출력
		t1.setHour(17);
		t1.setMinute(35);
		t1.setSecont(30);
		System.out.printf("%d,%d,%d\n",t1.getHour(),t1.getMinute(),t1.getSecond());
		
		Time t2 = new Time(17,35,30);
		System.out.printf("시간 : %d:%d:%d \n",t2.getHour(),t2.getMinute(),t2.getSecond());
		
		
		// 생성자의 접근제어자
		// 생성자에 접근제어자를 사용함으로써 인스턴스의 생성을 제한할 수 있다. => 메서드를 통해서만 생성이 가능하게.. 싱글톤패턴
		
		
		
	}

}
