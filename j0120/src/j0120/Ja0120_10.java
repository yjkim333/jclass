package j0120;

import java.util.Scanner;

public class Ja0120_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생성적프로그램
		// 변수 선언
		
		Stuscore[] s = new Stuscore[10]; // 배열선언
		int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		int[] score = new int[3]; // 국영수 저장 배열
		String name = "";
		double avg = 0;
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0;
		int temp = 0; // 검색
		int searchNo = 0; // 검색데이터 배열 위치값
		int r = 0; // 등수
		int count = 0; // 학생수 확인
		
		
		// 화면구현
		loop:while(true) {
			System.out.println("[ 학생 성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("0. 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				System.out.println("       [ 학생 성적 입력 ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				while(count<10) {
					System.out.printf("%d 번 학생 이름 입력 \n",count+1);
					name = scan.next();
					if(name.equals("0")) {
						break;
					}
					// 국어 영어 수학
					for(int i=0;i<score.length;i++) {
						System.out.printf("%s 점수 입력 >>",title[i+2]);
						score[i] = scan.nextInt();
					}
//					System.out.println("국어점수를 입력하세요.");
//					kor = scan.nextInt();
//					System.out.println("영어점수를 입력하세요.");
//					eng = scan.nextInt();
//					System.out.println("수학점수를 입력하세요.");
//					math = scan.nextInt();
					
					
					// name,kor,eng,math -> no, total, avg
					s[count] = new Stuscore(name,score[0],score[1],score[2]);
//					s[count] = new Stuscore(name,kor,eng,math);
					
					s[count].print();
					System.out.printf("%d 번 학생이 저장되었습니다. \n",s[count].no);
					System.out.println();
					
					count++;
				}
				break;
			case 2:
				System.out.println("                      [  성적 출력  ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",s[i].no);
					System.out.printf("%s\t",s[i].name);
					System.out.printf("%d\t",s[i].kor);
					System.out.printf("%d\t",s[i].eng);
					System.out.printf("%d\t",s[i].math);
					System.out.printf("%d\t",s[i].total);
					System.out.printf("%.2f\t",s[i].avg);
					System.out.printf("%d\n",s[i].rank);
				}
				System.out.println();
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
			
		}//while

		
		
		
		
		
	}

}
