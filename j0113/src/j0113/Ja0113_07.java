package j0113;

public class Ja0113_07 {

	public static void main(String[] args) {
//		형변환(Casting)
//		boolean 을 제외한 7개의 기본형은 서로 형변환이 가능
		int n1 = 65;
		char ch1 = (char)n1; // int -> char : 강제형변환 변환하려는 타입을 붙여줌. int>char
		System.out.println(n1);
		System.out.println(ch1);
		
		char ch2 = 'a';
		int n2 = ch2; // 변환하려는 타입 생략 가능
		System.out.println(n2);
		
		
		float f1 = 3.14F;
		int n3 = (int)f1;
		System.out.println(n3);
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2);
		
		//byte short int long float double 순
				
		
		

	}

}
