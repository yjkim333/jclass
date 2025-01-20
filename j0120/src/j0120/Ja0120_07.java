package j0120;

public class Ja0120_07 {
	
//	Ja0120_07(){} // 기본생성자

	public static void main(String[] args) {
		// 생성자(constructor)
		// 객체 생성할 때 사용.
		// 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
		// 인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용.
		// 모든 클래스에는 반드시 하나 이상의 생성자가 있어야함.
		// Card c = new Card();  => new : 연산자, Card() : 생성자 / c : 참조변수

		// 조건=>
		// 생성자의 이름은 클래스 이름과 같아야함. Card c = new Card();
		// 생성자는 리턴값이 없지만 void를 쓰지 않음.
		
		// 기본 생성자 - 매개변수가 없는 생성자  Card(){} - 없으면 자동으로 생성됨.
		
//		Cal c = new Cal(); // 객체선언 - new Cal() -> 생성자 호출
		
		Data1 d1 = new Data1();
		d1.value = 10;
		d1.name = "홍길동";
		d1.kor = 100;
		d1.eng = 100;
		d1.math = 99;
		System.out.println(d1.value);
		Data1 dd2 = new Data1();
		dd2.value = 11;
		dd2.name = "유관순";
		dd2.kor = 99;
		dd2.eng = 98;
		dd2.math = 97;
		
		Data2 d4 = new Data2(); // 기본생성자를 만들어야 객체선언 가능.
		Data2 d2 = new Data2(1,"홍길동",100,100,99);
		Data2 d3 = new Data2(2,"유관순",99,98,97);
		System.out.println(d2.value);
		
		
	}

}


class Data1{
	int value; // 인스턴스 변수 - 객체 선언 후 참조변수명.변수명으로 사용
	String name;
	int kor;
	int eng;
	int math;
}
class Data2{
	int value; // 인스턴스 변수 - 객체 선언 후 참조변수명.변수명으로 사용
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	Data2(){} // 기본생성자
	Data2(int x,String n, int k, int e, int m){ // 매개변수가 있는 생성자
		value = x;
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = kor+eng+math;
		avg = total/3.0;
	}
} // class
