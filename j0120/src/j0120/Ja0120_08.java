package j0120;

import java.util.Scanner;

public class Ja0120_08 {

	public static void main(String[] args) {
//		Car c = new Car();
//		c.color = "White";
//		c.gearType = "auto";
//		c.door = 4;
//		
//		// red,stick,5
//		Car c2 = new Car("red","stick",5);
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
//		
		
		// -----------------------------------------
		// 객체선언 후 1,홍길동,100,100,100 입력
		// 합계 평균 까지 출력
		
//		Stuscore s1 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.total = s1.kor+s1.eng+s1.math;
//		s1.avg = s1.total/3.0;
////		System.out.printf("s1출력 : %d,%s,%d,%d,%d,%d,%.2f\n",s1.no,s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
//		s1.print();
//		
//		Stuscore s2 = new Stuscore(2,"유관순",99,98,97);
////		System.out.printf("s2출력 : %d,%s,%d,%d,%d,%d,%.2f",s2.no,s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
//		s2.print();
//		
		
		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
////		c2 = c1; // 얕은 복사
//		Car c3 = new Car(c1); // 객체복사
		
		
		
		//--------------------------
		
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[3]; // 배열선언
		for(int i=0;i<3;i++){
			System.out.println("학생 이름 입력");
			String name = scan.next();
			System.out.println("국어 점수 입력");
			int kor = scan.nextInt();
			System.out.println("영어 점수 입력");
			int eng = scan.nextInt();
			System.out.println("수학 점수 입력");
			int math = scan.nextInt();
			s[i] = new Stuscore(name,kor,eng,math);
			s[i].print();
		}
		
		// 4번째 학생 입력
		Stuscore s1 = new Stuscore();
		System.out.println(s1.count);
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		s1.print();
		
				
		
		
		// 변수의 초기화
		// 정수,실수 - 0 , boolean - false
		// 클래스변수, 인스턴스변수는 자동 초기화
		// 지역변수는 초기화 해줘야함.
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
