package j0116;

import java.util.Scanner;

public class Ja0116_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 선언
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int count = 0; // 학생 수 
		int choice = 0;
		int temp = 0; // 검색
		int searchNo = 0; // 검색데이터 배열 위치값
		int r = 0; // 등수
				
		
		// 2. 화면 구현
		loop:while(true) {
			System.out.println("[  학생 성적 프로그램  ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("0. 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			// 3. 번호 선택 switch
			switch(choice) {
			case 1:
				// 4. 성적입력
				System.out.println("[ 학생 성적 입력 ]");
				int i = count;
				while(i<10) {
					// 번호
					no[i] = count+1;
					// 이름
					System.out.printf("[ %d 번째 학생 ] \n",count+1);
					System.out.printf("이름을 입력하세요.(0->이전메뉴) \n");
					name[i] = scan.next();
					// 0확인
					if(name[i].equals("0")) {
						break;
					}
					// 점수, 합계
					int total = 0;
					for(int j=0;j<3;j++) {
						System.out.printf("%s 점수를 입력하세요. \n",title[j+2]);
						score[i][j] = scan.nextInt();
						total += score[i][j];
					}
					score[i][3] = total;
					// 평균
					avg[i] = total/3.0;
					
					System.out.printf("%d번째 학생 성적이 저장되었습니다.",count+1);
					System.out.println();
					
					i++;
					count++;
				}//while
				break;
			
			case 2:
				System.out.println("[ 학생 성적 출력 ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				// title 출력
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				// 5. 성적출력
				for(int j=0;j<count;j++) {
					System.out.printf("%d\t",no[j]);
					System.out.printf("%s\t",name[j]);
					for(int k=0;k<4;k++) {
						System.out.printf("%d\t",score[j][k]);
					}
					System.out.printf("%.2f\t",avg[j]);
					System.out.printf("%d\n",rank[j]);
					System.out.println();
				}
				System.out.println();
				break;
			
			// 성적수정	
			case 3:
				System.out.println("[ 학생 성적 수정 ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("성적을 수정할 학생을 검색하세요.");
				String search = scan.next();
				temp = 0;
				searchNo = 0;
				for(int j=0;j<count;j++) {
					if(search.equals(name[j])) {
						searchNo = j; // 배열위치
						temp = 1; // 검색 성공
					}
				}
				if(temp == 0) {
					System.out.println("학생 검색 결과가 없습니다.");
				}else {
					System.out.printf("[ %s 학생 성적 수정 ] \n",search);
					System.out.println("1. 국어 성적 수정");
					System.out.println("2. 영어 성적 수정");
					System.out.println("3. 수학 성적 수정");
					System.out.println("0. 이전 메뉴로");
					System.out.println("원하는 번호를 입력하세요.");
					choice = scan.nextInt();
					
					switch(choice) {
					case 1 :
						System.out.println("[ 국어 성적 수정 ]");
						System.out.printf("현재 국어 성적 : %d \n",score[searchNo][0]);
						System.out.println("변경할 점수를 입력하세요.");
						score[searchNo][0] = scan.nextInt();
						System.out.println("국어점수가 변경되었습니다.");
						break;
					case 2 :
						System.out.println("[ 영어 성적 수정 ]");
						System.out.printf("현재 영어 성적 : %d \n",score[searchNo][1]);
						System.out.println("변경할 점수를 입력하세요.");
						System.out.println("영어점수가 변경되었습니다.");
						score[searchNo][0] = scan.nextInt();
						break;
					case 3 :
						System.out.println("[ 수학 성적 수정 ]");
						System.out.printf("현재 수학 성적 : %d \n",score[searchNo][1]);
						System.out.println("변경할 점수를 입력하세요.");
						System.out.println("수학점수가 변경되었습니다.");
						score[searchNo][0] = scan.nextInt();
						break;
					default:
						break;
					}//switch
					
					score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
					avg[searchNo] = score[searchNo][3]/3.0; 
					
				}//if
				break;
			
			// 등수처리
			case 4:
				r = 1;
				System.out.println("[ 등수 처리 ]");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for(int j=0;j<count;j++) {
					r = 1;
					for(int k=0;k<count;k++) {
						if(score[j][3]<score[k][3]) {
							r++;
						}
					}
					rank[j] = r;
				}
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
				
			// 6. 종료
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
			
		} //loop:while
		
		
		
		
	}

}
