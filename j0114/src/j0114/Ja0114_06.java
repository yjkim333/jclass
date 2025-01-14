package j0114;

import java.util.Scanner;

public class Ja0114_06 {

	public static void main(String[] args) {
		//조건문 - if / switch
		// java에서 조건문은 if 문, switch문 2가지
		// switch문은 if문으로 변경가능하지만 if문은 switch문으로 변경이 안되는 경우가 있다.
		// switch문이 속도가 빠름.
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		if (num>0) {
//			System.out.println("양수입니다.");
//		}else if(num==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		
		
		// if문 - 점수를 입력받아 A - 90점이상,B-80,C-70,D-60,F-60미만 학점 출력
		
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		if(score>=90) {
//			System.out.print("A학점");
//		}else if(score>=80) {
//			System.out.print("B학점");
//		}else if(score>=70) {
//			System.out.print("C학점");
//		}else if(score>=60) {
//			System.out.print("D학점");
//		}else {
//			System.out.print("F학점");
//		}
//		
//		System.out.println(" 입니다");
		
		
		
		// switch문
		// 1입력시 - 입력창
		// 2입력시 - 검색창
		// 3입력시 - 수정창
		// 4입력시 - 삭제창
		// 5입력시 - 종료
		
//			System.out.println("원하는 번호를 입력하세요.");
//			int num = scan.nextInt();
//			switch(num) {
//			case 1:
//				System.out.println("입력창이 열립니다.");
//				break;
//			case 2:
//				System.out.println("검색창이 열립니다.");
//				break;
//			case 3:
//				System.out.println("수정창이 열립니다.");
//				break;
//			case 4:
//				System.out.println("삭제창이 열립니다.");
//				break;
//			default:
//				System.out.println("종료창이 열립니다.");
//				break;
//				
//		}
		
		System.out.println("사용자 권한을 생성합니다.");
		int num = scan.nextInt();
		switch(num) {
		case 5:
			System.out.println("슈퍼바이저 권한이 부여됩니다.");
		case 4:
			System.out.println("삭제 권한이 부여됩니다.");
		case 3:
			System.out.println("수정 권한이 부여됩니다.");
		case 2:
			System.out.println("작성 권한이 부여됩니다.");
		case 1:
			System.out.println("읽기 권한이 부여됩니다.");
			break;
		}
		
		
	}

}
