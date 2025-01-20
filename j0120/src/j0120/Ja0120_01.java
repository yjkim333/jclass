package j0120;

public class Ja0120_01 {
	
	static int a = 10; // 클래스변수 -> 객체선언 없이 클래스명.변수명
	
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		// Ja0210_01.change(d.x); 로 쓰는게 원칙 이지만 같은 클래스 안에 있으면 생략가능
//		change(d.x);
		System.out.println("d.x : "+d.x);
		System.out.println("d : "+d);
		change(d);
		System.out.println("d.x : "+d.x);
		
		
	}
	
	// 매서드에 static이 붙으면 -> 객체 선언 없이 사용
	static void change(Data d) {
		d.x = 1000;
		System.out.println("Data d.x : "+d.x);
	}
//	static void change(int x) {
//		x = 1000;
//		System.out.println("x : "+x);
//	}

}
