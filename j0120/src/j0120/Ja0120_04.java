package j0120;

import java.util.Arrays;

public class Ja0120_04 {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 3;
////		System.out.println(a*b);
//		
//		// 객체선언
//		Cal c = new Cal();
//		int result = c.multi(a, b);
//		System.out.println(result);
//		
//		int result2 = c.add(a, b);
//		System.out.println(result2);
//		
//		double result3 = c.divi(a, b);
//		System.out.println(result3);
		
		// -------------------------------- 
		
		
//		// 입력부분을 class로 분리
//		// 5개를 입력 받아 출력하시오.
//		// 배열을 써서.
//		
//		// 객체선언 
//		Input i = new Input();
//		
//		int[] input = new int[5];
//		// 입력
//		for(int j=0;j<input.length;j++) {
//			input[j] = i.valInput();
//		}
//		// 출력
//		for(int j=0;j<input.length;j++) {
//			System.out.println("입력값 : "+input[j]);
//		}
		

		
		// --------------------------------
		
		// Cal2 - strPrint() 이름을 입력 받아
		// 메인메서드에서 str 변수로 넘겨받아 출력하시오.
		
//		Cal2 name = new Cal2();
//		String[] str = name.strPrint();
//		for(int i=0;i<str.length;i++) {
//			System.out.println("이름 : "+str[i]);
//		}
		
		
		// --------------------------------
		
		// 두 수를 Cal3에 보내면 +,-,* 의 값을 리턴해서 출력하시오
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;
		System.out.println(Arrays.toString(re));
		c3.op(a, b, re);
		
		System.out.println(Arrays.toString(re));
		
		
		
		
		
	}

}
