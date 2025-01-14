package j0113;

public class Ja0113_06 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = 65;
		System.out.println(ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		
		//char ch4 = 'AB'
		String ch4 = "AB";
		System.out.println(ch4);
		
		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1); // 타입 : String
		
		System.out.println(""+7); // 타입 : String
		
		System.out.println(""+7+7); // 77출력 타입 : String
		
		System.out.println(7+7+""); // 14출력 타입 : String
		
		System.out.println(7+7+""+7); // 147출력 타입 : String
		
		// char ch5 = ''; -> '' 사이에 아무것도 없는 것은 에러
		char ch6 = ' '; // '' 사이에 빈공백 문자 가능
		
		String s2 = ""; // String은 "" 사이에 아무것도 없어도 에러 안남
		
		
		byte b1  = 127;
		// byte b2 = 128; 에러- byte는 127까지만 들어감.
		
		
		int n1 = 2147483647;
		// int n2 = 2147483648; 에러 - int는 2147483647까지 들어감.
		
		int n3 = n1 +1;
		System.out.println(n3); // 오버플로우 -2147483648 최대값에서 더하기 1하면 최소값으로 간다. 띠 같이.
		
		
//		형변환(Casting)
//		boolean 을 제외한 7개의 기본형은 서로 형변환이 가능
		
	
		
		

	}

}
