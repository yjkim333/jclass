package j0123;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_01 {

	public static void main(String[] args) {
		// 학생성적프로그램
		// 번호,이름.국어.영어,수학,합계,평균\
		Stu_Deck sd = new Stu_Deck();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		loop:while(true) {
			// 1. 상단 메뉴
			choice = sd.main_print();
			
			switch(choice) {
			case 1: // 2. 성적 입력
				sd.intput();
				break;
			case 2: // 3. 출력
				sd.output();
				break;
			case 3: // 4. 학생 성적 수정
				sd.update();
				break;
			case 4:
				break;
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
		
		}// loop:while
		
	}//main

}//class
