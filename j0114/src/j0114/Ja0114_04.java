package j0114;

import java.util.Scanner;

public class Ja0114_04 {

	public static void main(String[] args) {
		// 증감연산자
//		int a = 10;
//		a++;
//		int b = a;
//		
//		System.out.println("a :"+a);
//		System.out.println("b :"+b);

		
		// byte, short, char => 사칙연산 시 int로 타입변경됨
		
//		byte a = 1;
//		byte b = 2;
//		byte c = (byte)(a+b);
//		System.out.println(c);
//		// byte d = (byte)a+(byte)b; 에러
//		
//		char ch = 'a'; //a:97 A:65 0:48
//		char ch2 = 'b'; //b:98
//		int ch3 = ch+ch2;
//		System.out.println("ch3 : "+ch3);
//		
//		double d1 = 3.14;
//		int num = (int)d1;
//		System.out.println("num : "+num);
//	
//		int a1 = 1000000;
//		int b1 = 2000000;
//		long c1 = (long)a1*b1;
//		System.out.println("c1 : "+c1);
//		
//		int n1 = 2100000000;
//		int n2 = 2100000000;
//		long n3 = (long)n1+n2;
//		System.out.println(n3);
		
		
//		char c1 = 'A';
//		char c2 = (char)(c1 + 1);
//		System.out.println(c2);
//		
//		int n1 = c1 + 1;
//		System.out.println(n1);
//		
//		char c3 = ++c1;
//		System.out.println(c3);
//		
//		int n2 = 'B' - 'A';
//		System.out.println(n2);
//		
//		int n3 = '9' - '0';
//		System.out.println(n3);
//		
//		int n4 = '2' - '2';
//		System.out.println(n4);
		
		
//		char ch1 = 'a';
//		char ch2 = (char)(ch1 -32);
//		System.out.println(ch2);
//		
//		char ch3 = 'A';
//		char ch4 = (char)(ch3+32);
//		System.out.println(ch4);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("소문자를 입력하세요.");
		char str = scan.next().charAt(0);
		str = (char)(str-32);
		System.out.println(str);
		
		
		
		
		

	}

}
