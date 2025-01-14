package j0114;

import java.util.Scanner;

public class Ja0114_05 {

	public static void main(String[] args) {
		// 올림-ceil, 버림-floor, 반올림-round
		
		// 버림
//		float pi = 3.141592F;
//		float pi2 = (int)(pi*10)/10F;
//		System.out.println(pi2);
		
		// 반올림
//		double pi = 3.141592;
//		double pi2 = Math.round(pi*1000)/1000.0;
//		System.out.println(pi2);
		
//		System.out.println(Math.round(10.958421));
//		System.out.println(Math.floor(10.958421));
//		System.out.println(Math.ceil(10.958421));
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 3자리 실수를 입력하세요.");
//		double input = scan.nextDouble();
//		
//		// 3자리에서 반올림 해서 값을 출력하시오
//		
//		System.out.println(Math.round(input*100)/100.0);
		
		
		
		
//		if(5>3) {
//			System.out.println("정답");
//		}else {
//			System.out.println("오답");
//		}
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("영문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		if ((input >= 'a' && input <= 'z') || (input>='A' && input <= 'Z')) {
//			System.out.println("영문 문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요.");
//		}
		
		
		// 삼항식
//		System.out.println("숫자를 입력하세요.");
//		int x = scan.nextInt();
//		int absX = x>=0?x:-x;
//		System.out.println(absX);
				
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		String result = (score>=60)?"합격":"불합격";
//		System.out.println("결과 :"+result);
		
		// 양수(0포함), 음수 체크
//		System.out.println("숫자를 입력하세요.");
//		int n = scan.nextInt();
//		String result = n>0?"양수":(n == 0)?"0":"음수";
//		System.out.println("결과 : "+result);
		
		// 3개의 숫자를 입력받아, 가장 큰 수를 출력하시오.
		System.out.println("숫자1을 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자2을 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("숫자3을 입력하세요.");
		int num3 = scan.nextInt();
		
		int maxNum = (num1>num2)?((num1>num3)?num1:num3):(num2>num3)?num2:num3;
		System.out.println("최대값 :"+maxNum);
		
		int minNum = (num1>num2)?(num2>num3?num3:num2):(num1>num3?num3:num1);
		System.out.println("최소값 :"+minNum);
		
		
		
		

	}

}
