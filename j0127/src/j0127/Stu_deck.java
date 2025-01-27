package j0127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Stu_deck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int choice;
	int temp;
	int update;
	int rankC;
	
	// 성적데이터 파일 읽어오기
	Stu_deck(){
		try {
			FileReader fr = new FileReader("c:/save/studata.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line!=null) {
					String[] arr = line.split(",");
					int no = Integer.parseInt(arr[0]);
					String name = arr[1];
					int kor = Integer.parseInt(arr[2]);
					int eng = Integer.parseInt(arr[3]);
					int math = Integer.parseInt(arr[4]);
					int total = Integer.parseInt(arr[5]);
					double avg = Double.parseDouble(arr[6]);
					int rank = Integer.parseInt(arr[7]);
					list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
				}else {
					break;
				}
					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	int main_menu() {
		System.out.println();
		System.out.println("----------------------");
		System.out.println(" [  학생 성적 프로그램  ]");
		System.out.println("    1. 학생 성적 입력");
		System.out.println("    2. 학생 성적 출력");
		System.out.println("    3. 학생 성적 검색");
		System.out.println("    4. 학생 성적 수정");
		System.out.println("    5. 학생 성적 삭제");
		System.out.println("    6. 등수 처리");
		System.out.println("    7. 파일 저장");
		System.out.println("    0. 프로그램 종료");
		System.out.println("----------------------");
		System.out.println("  원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		System.out.println();
		return choice;
	}//main_menu
	
	// 학생성적입력
	void Stu_add() {
		System.out.println("                       [ 학생 성적 입력 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		while(true) {
			System.out.println();
			System.out.println(Stu.count+1+"번 학생 이름을 입력하세요. (0-> 이전 메뉴)");
			String name = scan.next();
			if(name.equals("0")) {
				break;
			}
			System.out.println(" 국어 점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println(" 영어 점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println(" 수학 점수를 입력하세요.");
			int math = scan.nextInt();
			list.add(new Stu(name,kor,eng,math));
			
		}
	}//Stu_add
	
	// 학생성적출력
	void print_all() {
		loop:while(true) {
			System.out.println("                       [ 학생 성적 출력 ]");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			// 상단 타이틀
			for (int i = 0; i < title.length; i++) {
				System.out.printf("%s\t",title[i]);
			}
			System.out.println();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			// 성적
			for (int i = 0; i < list.size(); i++) {
				Stu s = list.get(i);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),
						s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			}
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(" 1. 이름 순차 정렬");
			System.out.println(" 2. 등수 순차 정렬");
			System.out.println(" 0. 이전메뉴");
			System.out.print(" 원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				list.sort(new Comparator<Stu>() {

					@Override
					public int compare(Stu s1, Stu s2) {
						return s1.getName().compareTo(s2.getName());
					}
				});
				break;
			case 2:
				list.sort(new Comparator<Stu>(){
					
					@Override
					public int compare(Stu s1, Stu s2) {
						return s2.getTotal() - s1.getTotal();
					}
					
				});
				break;
			case 0:
				break loop;
			}
		}
	}//print_all
	
	//학생 성적 검색
	void stu_search() {
		System.out.println("                       [ 학생 성적 검색 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		while(true) {
			ArrayList<Stu> search_result = new ArrayList<Stu>();
			temp = 0;
			System.out.println();
			System.out.println("검색하려는 학생 이름을 입력하세요. (0-> 이전 메뉴)");
			String input = scan.next();
			if(input.equals("0")) {
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if(input.equals(list.get(i).getName())) {
					search_result.add(list.get(i));
					temp = 1;
				}
			}
			System.out.println("                         [ 검색 결과 ]");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			if(temp !=1 ) {
				System.out.printf("'%s'학생 검색 결과가 없습니다.\n다시 입력하세요.\n",input);
			}else {
				// 상단 타이틀
				for (int i = 0; i < title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for (int i = 0; i < search_result.size(); i++) {
					Stu sr = search_result.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",sr.getNo(),sr.getName(),
							sr.getKor(),sr.getEng(),sr.getMath(),sr.getTotal(),sr.getAvg(),sr.getRank());
				}
			}
		}
	}//stu_search
	
	//학생 성적 수정
	void stu_update() {
		System.out.println("                       [ 학생 성적 수정 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		loop:while(true) {
			ArrayList<Stu> search_result = new ArrayList<Stu>();
			ArrayList<Integer> location = new ArrayList<Integer>();
			temp = 0;
			System.out.println();
			System.out.println("수정하려는 학생 이름을 입력하세요. (0-> 이전 메뉴)");
			String input = scan.next();
			if(input.equals("0")) {
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if(input.equals(list.get(i).getName())) {
					search_result.add(list.get(i));
					temp = 1;
					location.add(i);
				}
			}
			System.out.println("                         [ 검색 결과 ]");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			if(temp !=1 ) {
				System.out.printf("'%s'학생 검색 결과가 없습니다.\n다시 입력하세요.\n",input);
			}else {
				// 상단 타이틀
				for (int i = 0; i < title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				// 검색결과 출력
				if(search_result.size()>1) {
					for (int i = 0; i < search_result.size(); i++) {
						Stu sr = search_result.get(i);
						System.out.printf("[%d번째 %s]\n",i+1,sr.getName());
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",sr.getNo(),sr.getName(),
								sr.getKor(),sr.getEng(),sr.getMath(),sr.getTotal(),sr.getAvg(),sr.getRank());
						System.out.println();

					}
					System.out.printf("몇번째 %s학생을 수정하시겠습니까?\n",input);
					int update_c = scan.nextInt(); 
					update = location.get(update_c-1);
				}else {
					for (int i = 0; i < search_result.size(); i++) {
						Stu sr = search_result.get(i);
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",sr.getNo(),sr.getName(),
								sr.getKor(),sr.getEng(),sr.getMath(),sr.getTotal(),sr.getAvg(),sr.getRank());
						System.out.println();
					}
				}
				Stu s = list.get(update);
				System.out.printf("[ %s 성적 수정 ]\n",input);
				System.out.printf("1. 국어 점수 (현재 점수 : %d점)\n",s.getKor());
				System.out.printf("2. 영어 점수 (현재 점수 : %d점)\n",s.getEng());
				System.out.printf("3. 수학 점수 (현재 점수 : %d점)\n",s.getMath());
				System.out.println("0. 메인 메뉴");
				System.out.println("수정할 과목을 입력해주세요.");
				choice = scan.nextInt();
				switch(choice) {
				case 1:
					System.out.println("수정할 국어 점수를 입력해주세요.");
					s.setKor(scan.nextInt());
					break;
				case 2:
					System.out.println("수정할 영어 점수를 입력해주세요.");
					s.setEng(scan.nextInt());
					break;
				case 3:
					System.out.println("수정할 수학 점수를 입력해주세요.");
					s.setMath(scan.nextInt());
					break;
				case 0:
					break loop;
				}
				s.setTotal(s.getKor()+s.getEng()+s.getMath());
				s.setAvg(s.getTotal()/3.0);
				System.out.println("성적 수정이 완료되었습니다.");
			}
		}
	}//stu_update
	
	//학생 성적 삭제
	void stu_remove() {
		System.out.println("                       [ 학생 성적 삭제 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		while(true) {
			ArrayList<Stu> search_result = new ArrayList<Stu>();
			temp = 0;
			System.out.println();
			System.out.println("삭제하려는 학생 이름을 입력하세요. (0-> 이전 메뉴)");
			String input = scan.next();
			if(input.equals("0")) {
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if(input.equals(list.get(i).getName())) {
					search_result.add(list.get(i));
					temp = 1;
				}
			}
			System.out.println("                         [ 검색 결과 ]");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			if(temp !=1 ) {
				System.out.printf("'%s'학생 검색 결과가 없습니다.\n다시 입력하세요.\n",input);
			}else {
				// 상단 타이틀
				for (int i = 0; i < title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for (int i = 0; i < search_result.size(); i++) {
					Stu sr = search_result.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",sr.getNo(),sr.getName(),
							sr.getKor(),sr.getEng(),sr.getMath(),sr.getTotal(),sr.getAvg(),sr.getRank());
				}
				System.out.println();
				System.out.printf("'%s'학생의 데이터를 완전히 삭제하시겠습니까?(1.yes 2.no)\n",input);
				choice = scan.nextInt();
				if(choice == 2) {
					System.out.println("삭제를 취소합니다.");
					break;
				}else {
					list.remove(search_result.get(0).getNo());
					System.out.println(search_result.get(0).getNo()-1);
					System.out.printf("'%s'학생의 데이터가 완전히 삭제되었습니다.\n",input);
				}
			}
		}
	}//stu_remove
	
	//등수 처리
	void stu_rank() {
		System.out.println("                         [ 등수 처리 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (int i = 0; i < list.size(); i++) {
			rankC = 1;
			for (int j = 0; j < list.size(); j++) {
				list.get(i).setRank(rankC);
				if(list.get(i).getTotal()<list.get(j).getTotal()) {
					rankC++;
				}
			}
		}
		System.out.println("*** 등수처리가 완료되었습니다. ***");
	}//stu_rank
	
	//파일 저장
	void stu_dataSave() {
		try {
			System.out.println("저장할 파일명을 입력하세요.");
			String fileName = scan.next();
			FileWriter fw = new FileWriter(String.format("c:/save/%s.txt", fileName));
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < list.size(); i++) {
				Stu s = list.get(i);
				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", 
						s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				bw.write(str);
			}
			bw.close();
			fw.close();
			System.out.printf("학생데이터가 %s.txt에 저장되었습니다.",fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//stu_dataSave
	
	
}
