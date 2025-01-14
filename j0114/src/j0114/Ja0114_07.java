package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		// 반복문
		// for - 반복 횟수 있는 경우
		// while - 조건식이 있는 경우
		
		
		//for (초기화;조건식;증감식){}
		
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			System.out.println("안녕하세요.");
////			sum = sum + i;
//			sum += i;
//		}
//		
//		System.out.println(sum);
		
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("글자를 입력하세요.(영문자만 가능)");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력 :" + ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요!");
//		}
		
		
		// 모든 단어 1개씩 출력
//		String input = "abcdefghijk";
//		
//		for (int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
		
//		System.out.println(input.length());
//		System.out.println(input.charAt(4));
//		System.out.println(input.charAt(input.length()-1));
		
		
		
		// 입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오.
//		System.out.println("영문자를 입력하세요.");
//		String input = scan.next();
		
		// 모두 영문자일때 만 1개씩 출력
		// 1. 영문자인지 확인
//		int temp = 0;
//		for (int i=0;i<input.length();i++) {
//			char ch = input.charAt(i);
//			if (!(ch>='a' && ch<='z' || ch>='A' && ch<='Z')) {
//				temp = 1;
//				break;
//			}
//		}
//		// 2. 영문자면 출력 아니면 다시 입력 출력
//		if(temp==0) {
//			for (int i=0;i<input.length();i++) {
//				System.out.println(input.charAt(i));
//			}
//		}else {
//			System.out.println("모두 영문자로 작성해주세요.");
//		}
		
		
		// for
		// 무한반복
//		for(int i=0;;i++) {
//			System.out.println("안녕"+i);
//			if(i==10) {
//				break;
//			}
//		}
		
		
		// 구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d =%d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
//		
//		// 입력받은 숫자부터 구구단이 시작되도록 구현
//		System.out.println("숫자1를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.");
//		int num2 = scan.nextInt();
//		
//		int max,min;
////		if(num1>num2) {
////			max = num1;
////			min = num2;
////		}else {
////			max = num2;
////			min = num1;
////		}
//		
//		max = Math.max(num1, num2);
//		min = Math.min(num1, num2);
//		
//		for(int i=min;i<=max;i++) {
//			System.out.printf("[ %d 단] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d =%d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		// while 반복문
//		int i = 1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//		
//		for (int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}
		
//		for(int i=2;i<10;i++) {
//			for (int j=1;j<10;j++) {
//				System.out.printf("%d x %d =%d",i,j,i*j);
//			}
//		}
		
		// while로 구구단 출력
		int j = 2;
		while(j<10) {
			System.out.println(j+"단");
			int k = 1;
			while(k<10) {
				System.out.printf("%d x %d =%d \n",j,k,j*k);
				k++;
			}
			j++;
			System.out.println();
		}
		
		
		
		
		
		
		
	
	}

}
