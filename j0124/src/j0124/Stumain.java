package j0124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Stumain {

	public static void main(String[] args) throws Exception {
		StuDeck stuDeck = new StuDeck();
		// 성적 데이터 파일 읽어오기
		stuDeck.fileRead();
		
		
		Scanner scan = new Scanner(System.in);
		int choice = 0, temp = 0, count = 0;
		loop:while(true) {
			System.out.println();
			System.out.println(" [  학생 성적 프로그램  ]");
			System.out.println("    1. 학생 성적 입력");
			System.out.println("    2. 학생 성적 출력");
			System.out.println("    3. 학생 성적 수정");
			System.out.println("    4. 학생 성적 삭제");
			System.out.println("    5. 학생 성적 검색");
			System.out.println("    6. 학생 등수 정렬");
			System.out.println("    7. 학생 이름 정렬");
			System.out.println("    8. 등수 처리");
			System.out.println("    9. 파일 저장");
			System.out.println("    0. 프로그램 종료");
			System.out.println("----------------------");
			System.out.println("  원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				break;
			case 2:
				// 2. 학생 성적 출력
				stuDeck.listPrint();
				break;
			case 3:
				break;
			case 4:
				stuDeck.remove();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				stuDeck.saveFile();
				break;
			case 0:
				System.out.println("ㅡㅡㅡ [ 프로그램 종료 ] ㅡㅡㅡ");
				break loop;
			
			}
			
		}

		
		
		
		
	}//main

}
