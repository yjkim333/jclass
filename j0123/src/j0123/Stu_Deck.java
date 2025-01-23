package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	// 변수 선언
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no = 0,kor=0, eng=0, math=0, total=0, rank = 0;
	String name = "";
	double avg = 0;
	int choice = 0;
	int temp = 0; // 검색확인
	int searchCount = 0;// 검색위치확인
	int rankCount = 0; // 등수
	
	public Stu_Deck() {}
	
	// 1. 상단 메뉴 메서드
	int main_print() {
		System.out.println();
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 등수 처리");
		System.out.println("0. 종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		return choice;
	}//main_print
	
	
	// 2. 성적 입력 메서드
	void intput() {
		System.out.println("[ 학생 성적 입력 ]");
		// 입력
		while(true) {
			System.out.printf("[ %d 번째 ]\n",list.size()+1);
			// 이름
			System.out.println("이름을 입력하세요. (0.이전 메뉴 이동)");
			name = scan.next();
			// 0 인지 확인
			if(name.equals("0")) {
				break;
			}
			// 국어 영어 수학 점수
			System.out.printf("국어 점수를 입력하세요. \n");
			kor = scan.nextInt();
			System.out.printf("영어 점수를 입력하세요. \n");
			eng = scan.nextInt();
			System.out.printf("수학 점수를 입력하세요. \n");
			math = scan.nextInt();
			
			// list 저장
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s 학생이 저장되었습니다.\n",name);
		}//while
	}//intput
	
	// 3. 출력 메서드
	void output() {
		System.out.println("                    [ 학생 성적 출력 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int j=0;j<list.size();j++) {
//			list.get(0); // Object타입 - 형변환 필요
			Stu s = (Stu)list.get(j); // 형변환
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
	}//output
	
	void update() {
		System.out.println("                      [ 학생 성적 수정 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("성적 수정할 학생을 입력하세요.");
		String search = scan.next();
		for (int i = 0; i < list.size(); i++) {
			Stu s = (Stu)list.get(i);
			if(search.equals(s.getName())) {
				temp = 1;
				searchCount = i;
				break;
			}else {
				temp = 0;
				break;
			}
		}//for
		if(temp == 1) {
			System.out.printf("[  %s 학생 성적 수정  ]\n",search);
			System.out.println("1. 국어 성적 수정");
			System.out.println("2. 영어 성적 수정");
			System.out.println("3. 수학 성적 수정");
			System.out.println("수정할 과목을 선택하세요.");
			choice = scan.nextInt();
			System.out.println("----------------------");
			switch(choice) {
			case 1 :
				System.out.println("[국어 점수 변경]");
				System.out.println("현재 국어 점수 : "+((Stu)list.get(searchCount)).getKor());
				System.out.println("변경할 점수를 입력하세요.");
				((Stu)list.get(searchCount)).setKor(scan.nextInt());
				break;
			case 2 :
				System.out.println("[영어 점수 변경]");
				System.out.println("현재 영어 점수 : "+((Stu)list.get(searchCount)).getEng());
				System.out.println("변경할 점수를 입력하세요.");
				((Stu)list.get(searchCount)).setEng(scan.nextInt());
				break;
			case 3 :
				System.out.println("[수학 점수 변경]");
				System.out.println("현재 수학 점수 : "+((Stu)list.get(searchCount)).getMath());
				System.out.println("변경할 점수를 입력하세요.");
				((Stu)list.get(searchCount)).setMath(scan.nextInt());
				break;
			}
			System.out.println();
			System.out.println("성적이 수정되었습니다.");
			
		}else {
			System.out.println("검색된 학생이 없습니다.");
		}
				
		
	}//update
	
	
}
