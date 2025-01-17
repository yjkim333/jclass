package j0117;


public class Ja0117_07 {

	public static void main(String[] args) {
		// 클래스 변수 - 객체선언 없이 클래스명.변수명 - 공통으로 사용하기 때문에 변경시 모두 변경
		Stu.count = 10;
		// Stu.id = "aaa"; -에러 - 지역변수는 객체선언 없이 못 씀 
		System.out.println("Stu.count : "+Stu.count);
		
		
		// 인스턴스 변수 - 객체선언 후 참조변수명.변수명
		Stu s1 = new Stu();
		s1.id = "aaa";
		s1.count = 100; // 클래스변수
		s1.age = 100;
		System.out.println("s1 id : "+s1.id);
		System.out.println("s1 count : "+s1.count);
		System.out.println("s1 age : "+s1.age);
		
		Stu s2 = new Stu();
		s2.id = "bbb";
		s2.count = 500; // 클래스변수
		s2.age = 500;
		System.out.println("s2 id : "+s2.id);
		System.out.println("s2 count : "+s2.count);
		System.out.println("s2 age : "+s2.age);
		
		
		
		
		
	}

}
