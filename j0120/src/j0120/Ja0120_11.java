package j0120;

import java.util.Scanner;

public class Ja0120_11 {

	public static void main(String[] args) {
		// 배열 X, 객체사용으로 학생성적프로그램
		// 성적입력 출력 수정
		
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10];
		
		int[] score = new int[3];
		int total = 0, rank = 0;
		String name = "";
		double avg = 0;
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0;
		int count = 0; // 학생수
		int temp = 0; // 검색 결과
		int searchNo = 0; // 검색데이터 배열 위치값
		int rankCount = 0;
		
		loop:while(count<10) {
			System.out.println("[  학생 성적 프로그램  ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				while(true) {
					System.out.println("     [ 성적 입력 ]");
					System.out.println("--------------------");
					System.out.printf("%d번 학생 이름 입력 >> ",count+1);
					name = scan.next();
					if(name.equals("0")) {
						break;
					}
					for(int i=0;i<score.length;i++) {
						System.out.printf("%s 성적 입력 >> ",title[i+2]);
						score[i] = scan.nextInt();
					}
					
					s[count] = new Stuscore(name,score[0],score[1],score[2]);
					
					s[count].print();
					System.err.printf("%d번 학생성적이 저장되었습니다.\n",s[count].no);
					System.out.println();
					count++;
				}
				break;
			case 2:
				System.out.println("                        [  성적 출력  ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				
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
				System.out.println("                        [  성적 수정  ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.printf("성적을 수정할 학생 이름 >>");
				String search = scan.next();
				for(int i=0;i<count;i++) {
					if(search.equals(s[i].name)) {
						searchNo = i;
						temp = 1;
					}
				}
				if(temp == 0) {
					System.out.println("검색 결과가 없습니다.");
				}else {
					System.out.printf("%s 학생 성적 수정\n",search);
					System.out.println("1. 국어 성적 수정");
					System.out.println("2. 영어 성적 수정");
					System.out.println("3. 수학 성적 수정");
					System.out.printf("원하는 번호 입력 >> ");
					choice = scan.nextInt();
					System.out.println();
					
					switch(choice) {
					case 1:
						System.out.printf("현재 점수 : %d \n",s[searchNo].kor);
						System.out.printf("변경할 점수 입력 >> ");
						s[searchNo].kor = scan.nextInt();
						break;
					case 2:
						System.out.printf("현재 점수 : %d \n",s[searchNo].eng);
						System.out.printf("변경할 점수 입력 >> ");
						s[searchNo].eng = scan.nextInt();
						break;
					case 3:
						System.out.printf("현재 점수 : %d \n",s[searchNo].math);
						System.out.printf("변경할 점수 입력 >> ");
						s[searchNo].math = scan.nextInt();
						break;
					}//switch
					s[searchNo].total = s[searchNo].kor+s[searchNo].eng+s[searchNo].math;
					s[searchNo].avg = s[searchNo].total/3.0;
					System.out.println();
					System.out.printf("학생 점수가 수정되었습니다.");
					
				}
				break;
			
			case 4:
				for(int i=0;i<count;i++) {
					rankCount = 1;
					for(int j=0;j<count;j++) {
						if(s[i].total<s[j].total) {
							rankCount++;
						}
						s[i].rank = rankCount;
					}
				}
				System.out.println("등수처리가 완료되었습니다.");
				
				
				break;
			default:
				System.out.println("ㅡㅡㅡ [ 프로그램 종료 ] ㅡㅡㅡ");
				break loop;
			}
		}
	}
}
