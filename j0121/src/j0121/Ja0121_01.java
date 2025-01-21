package j0121;

public class Ja0121_01 {

	public static void main(String[] args) {
		// 상속(inheritance) - 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것.(클래스의 재사용)
		// 사용법 - 자손클래스 extends 부모(조상)클래스
		// 자손은 조상의 모든 멤버를 상속받는다. 자손의 멤버개수는 조상보다 적을 수 없다.
		
		// 클래스간 관계
		// 1. 상속관계 - 공통부분은 조상에서 관리하고 개별부분은 자손에서 관리한다.
		//           - 조상의 변경은 자손에 영향을 미치지만, 자손의 변경은 조상에 아무런 영향을 미치지 않음.
		//           - 조상에서는 최소한의 공통부분만 두고 개별부분은 자손에서.
		// 2. 포함관계 - 객체선언

		
		// 객체선언 - 포함관계
//		Point p = new Point();
//		p.x = 10;
//		p.y = 5;
//		System.out.println(p.x);
//		System.out.println(p.y);
		
//		Circle c = new Circle();
//		c.x = 100;
//		System.out.println(c.x);
		
		
		// --------------------------------------------
		// 기본생성자
		Circle c1 = new Circle();
		// 넓이 - 반지름*반지름*3.14
		double di = c1.r*c1.r*3.14;
		System.out.println("넓이 : "+di);
		c1.draw();
		
		// 매개변수생성자
		Circle c2 = new Circle(new Point(150,150),50);
		// 넓이 - 반지름*반지름*3.14
		double di2 = c2.r*c2.r*3.14;
		System.out.println("넓이 : "+di2);
		c2.draw();
		
		// Point center = new Point(150,150);
		// Circle c2 = new Circle(center,50);
		
		
		// --------------------------------------------
		// Point[] p - 삼각형은 3개의 꼭지점
//		Point[] p = new Point[3];
//		p[0] = new Point(100,100);
//		p[1] = new Point(140,50);
//		p[2] = new Point(200,100);
//		Triangle t1 = new Triangle(p);
		
//		int arr = {1,2,3};
//		int arr2 = new int[3];
//		int arr3 = new int[] {1,2,3};
		
		Point[] p = {new Point(100,100),new Point(140,50),new Point(200,100)};
		Triangle t1 = new Triangle(p);
		
		t1.draw();
		
		
		
		
	}

}
