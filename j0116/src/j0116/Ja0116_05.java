package j0116;

import java.util.Scanner;

public class Ja0116_05 {

	public static void main(String[] args) {
		// 학생성적프로그램
		// 번호,이름.국어.영어,수학,합계,평균\
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언
		int count = 0; // 학생 수 
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0;
		int temp = 0; // 검색확인
		int rankCount = 0; // 등수
		
		// 무한반복
		loop:while(true) {
			
			// 화면구현
			System.out.println();
			System.out.println("[ 학생 성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("0. 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생 성적 입력 ]");
				// 입력
				int i = count;
				while(i<10) {
					// 번호
					System.out.printf("[ %d 번째 ]\n",count+1);
					no[i] = count+1;
					
					// 이름
					System.out.println("이름을 입력하세요. (0.이전 메뉴 이동)");
					name[i] = scan.next();
					
					// 0 인지 확인
					if(name[i].equals("0")) {
						break;
					}
					
					// 국어 영어 수학 점수
					int total = 0;
					for(int j=0;j<3;j++) {
						System.out.printf("%s 점수를 입력하세요. \n",title[j+2]);
						score[i][j] = scan.nextInt();
						total += score[i][j];
					}
					
					// 합계, 평균
					score[i][3] = total;
					avg[i] = total/3.0;
					
					System.out.printf("%d 번 학생이 저장되었습니다.\n",count+1);
								
					i++;
					count ++;
				}//while
				break;
				
			case 2:
				// 출력
				System.out.println("                    [ 학생 성적 출력 ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				
				for(int j=0;j<count;j++) {
					System.out.printf("%d\t",no[j]);
					System.out.printf("%s\t",name[j]);
					for(int k=0;k<4;k++) {
						System.out.printf("%d\t",score[j][k]);
					}
					System.out.printf("%.2f\t",avg[j]);
					System.out.printf("%d\n",rank[j]);
				}
				break;
			
			case 3:
				// 수정
				System.out.println("                    [ 학생 성적 수정 ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				// 수정 할 학생 이름 검색
				System.out.println("성적 수정할 학생이름을 검색하세요.");
				String search = scan.next();
				
				// name 배열안에 이름
				temp = 0;
				int searchNo = 0;
				for(int j=0;j<name.length;j++) {
					if(search.equals(name[j])) {
						searchNo = j; // 배열위치값
						temp = 1; // 검색한 데이터 있음
					}
				}
				if(temp == 0) {
					System.out.println("검색 결과가 없습니다.");
				}else {
					System.out.printf("[%s 학생 성적 수정]\n",search);
					System.out.println("1. 국어 점수 수정");
					System.out.println("2. 영어 점수 수정");
					System.out.println("3. 수학 점수 수정");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("원하는 번호를 입력하세요.");
					choice = scan.nextInt();
					switch(choice) {
					case 1:
						System.out.println("[ 국어 점수 수정 ]");
						System.out.printf("현재 점수 : %d\n",score[searchNo][0]);
						System.out.println("변경할 점수를 입력하세요.");
						score[searchNo][0] = scan.nextInt();
						break;
					case 2:
						System.out.println("[ 영어 점수 수정 ]");
						System.out.printf("현재 점수 : %d",score[searchNo][1]);
						System.out.println("변경할 점수를 입력하세요.");
						score[searchNo][1] = scan.nextInt();
						break;
					case 3:
						System.out.println("[ 수학 점수 수정 ]");
						System.out.printf("현재 점수 : %d",score[searchNo][2]);
						System.out.println("변경할 점수를 입력하세요.");
						score[searchNo][2] = scan.nextInt();
						break;
					}//switch
					score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
					avg[searchNo] = score[searchNo][3]/3.0;
				}//if
				
				break;
				
			case 4:
				// 등수처리
				System.out.println("                    [ 학생 등수 처리 ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");			
				
				for(int j=0;j<count;j++) {
					rankCount = 1;// 등수리셋
					for(int k=0;k<count;k++) {
						if(score[j][3]<score[k][3]) {
							rankCount++;
						}
					}
					rank[j] = rankCount;
				}
				
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
				
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
		
		}// loop:while
		
	}//main

}//class
