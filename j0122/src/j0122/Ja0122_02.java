package j0122;

import java.util.Calendar;
import java.util.Date;

public class Ja0122_02 {

	public static void main(String[] args) {
		// 제어자의 조합
		// 메서드에 static과 abstract를 함께 사용할 수 없다.
		// 클래스에 abstract와 final을 동시에 쓸 수 없더.
		
		
		
		// 객체선언
		// 싱글톤패턴
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1 : "+s1.getNum());
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2 : "+s2.getNum());
		Singleton s3 = Singleton.getInstance();
		System.out.println("s3 : "+s3.getNum());
		Singleton s4 = Singleton.getInstance();
		System.out.println("s4 : "+s4.getNum());
		
		s1.setNum(100);
		System.out.println("s1 num 값 변경");
		System.out.println("s1 : "+s2.getNum());
		System.out.println("s2 : "+s2.getNum());
		
//		
//		
		Car c1 =  new Car();
		Car c2 =  new Car();
		Car c3 =  new Car();
		
		int a = 10;
		long b = 10;
		a = (int)b; // 형 변환
		
		Time t1 = new Time();
		
		
//		Date d = new Date();
//		System.out.println(d.toString());
//		Date d2 = new Date();
//		System.out.println(d2.toString());
//		
//		
//		Calendar c1 = Calendar.getInstance();
//		System.out.println(c1.getTime());
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c2.getTime());
		
		
		
		
		
		
		
	}

}
