package stuProject;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class StuDeck {
	int choice = 0;
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> stu_list = new ArrayList<Stu>();
	ArrayList<Stu> search_result = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int[] score = new int[3];
	int rankC = 0;
	Stu u;
	
	// 성적데이터 txt 불러오기
	StuDeck(){
		try {
			FileReader fr = new FileReader("c:/save/studata.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				} else {
					String[] arr = line.split(",");
					int no = Integer.parseInt(arr[0]);
					String name = arr[1];
					int kor = Integer.parseInt(arr[2]);
					int eng = Integer.parseInt(arr[3]);
					int math = Integer.parseInt(arr[4]);
					int total = Integer.parseInt(arr[5]);
					double avg = Double.parseDouble(arr[6]);
					int rank = Integer.parseInt(arr[7]);
					stu_list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 메인메뉴
	int main_menu() {
		System.out.println();
		System.out.println("----------------------");
		System.out.println(" [  학생 성적 프로그램  ]");
		System.out.println("    1. 학생 성적 입력");
		System.out.println("    2. 학생 성적 출력");
		System.out.println("    3. 학생 성적 검색");
		System.out.println("    4. 등수 처리");
		System.out.println("    7. 파일 저장");
		System.out.println("    0. 프로그램 종료");
		System.out.println("----------------------");
		System.out.println("  원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		System.out.println();
		return choice;
	}//main_menu
	
	
	// 학생 성적 입력
	void stu_add() {
		System.out.println("                       [ 학생 성적 입력 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		while(true) {
			System.out.println(Stu.count+1+"번 학생 이름을 입력하세요. (0.이전메뉴)");
			String name = scan.next();
			if(name.equals("0")) {
				break;
			}
			for (int i = 0; i < score.length; i++) {
				System.out.printf("%s 점수를 입력하세요. \n",title[i+2]);
				score[i] = scan.nextInt();
			}
			stu_list.add(new Stu(name,score[0],score[1],score[2]));
			System.out.println("------------------------------");
			System.out.println(name+" 학생의 성적이 저장되었습니다.");
			System.out.println();
		}
		
	}//stu_add
		
	// 학생 성적 출력
	void stu_print_all() {
		while(true) {
			System.out.println("                       [ 학생 성적 출력 ]");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			// 상단타이틀
			for (int i = 0; i < title.length; i++) {
				System.out.printf("%s\t",title[i]);
			}
			System.out.println();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			// 학생 성적출력
			for (int i = 0; i < stu_list.size(); i++) {
				Stu s = stu_list.get(i);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			}
			// 정렬
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 이름 순차 정렬");
			System.out.println("2. 등수 순차 정렬");
			System.out.println("원하는 번호를 입력하세요. (0.이전 메뉴)");
			choice = scan.nextInt();
			if(choice == 1) {
				stu_list.sort(new Comparator<Stu>(){
					@Override
					public int compare(Stu s1, Stu s2) {
						return s1.getName().compareTo(s2.getName());
					}
				});
			}else if(choice == 2) {
				stu_list.sort(new Comparator<Stu>() {
					@Override
					public int compare(Stu s1, Stu s2) {
						return s2.getTotal() - s1.getTotal();
					}
				});
			}else {
				break;
			}
		}
	}//stu_print_all

	// 학생 성적 검색
	void stu_update() {
		int updateNum;
		while(true) {
			System.out.println("                       [ 학생 성적 검색 ]");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("검색할 학생 이름을 입력하세요. (0. 이전 메뉴)>> ");
			String search = scan.next();
			System.out.println();
			if(search.equals("0")) {
				break;
			}
			for (int i = 0; i < stu_list.size(); i++) {
				if(search.equals(stu_list.get(i).getName())) {
					search_result.add(stu_list.get(i));
				}
			}
			if(search_result.size() == 0) {
				System.out.printf("*** '%s' 검색 결과 없음 - 다시 입력하세요. ***\n\n",search);
			}else {
				loop:while(true) {
					System.out.println();
					System.out.println();
					System.out.println("                       [ 학생 검색 결과 ]");
					System.out.println("=============================================================");
					// 상단타이틀
					for (int i = 0; i < title.length; i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					// 학생 성적출력
					if(search_result.size()>1) {
						for (int i = 0; i < search_result.size(); i++) {
							Stu s = search_result.get(i);
							System.out.printf("[ %d번째 ]\n",i+1);
							System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),
									s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
							System.out.println();
						}
					}else {
						for (int i = 0; i < search_result.size(); i++) {
							Stu s = search_result.get(i);
							System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),
									s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
						}
					}
					// 수정 삭제
						System.out.println("=============================================================");
						System.out.println("1. 성적 수정");
						System.out.println("2. 성적 삭제");
						System.out.println("3. 재검색");
						System.out.println("원하는 번호를 입력하세요.");
						choice = scan.nextInt();
						switch(choice) {
						case 1:
							System.out.println("                       [ 학생 성적 수정 ]");
							System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
							if(search_result.size()>1) {
								System.out.println("몇 번째 검색결과의 학생을 수정하시겠습니까?(0.이전메뉴)");
								choice = scan.nextInt();
								if(search.equals("0")) {
									break;
								}
								System.out.println(search+" 학생 성적 수정");
								for (int i = 0; i < 3; i++) {
									System.out.printf("%d. %s 점수 수정\n",i+1,title[i+2]);
								}
								System.out.println("수정할 과목의 번호 입력하세요.");
								int update = scan.nextInt();
								
								u = stu_list.get((search_result.get(choice-1).getNo())-1);
								switch(update) {
								case 1:
									System.out.printf("현재 %s 점수 : %d 점\n",title[2],search_result.get(choice-1).getKor());
									System.out.printf("변경할 %s 점수를 입력하세요.",title[2]);
									updateNum = scan.nextInt();
									u.setKor(updateNum);
									break;
								case 2:
									System.out.printf("현재 %s 점수 : %d 점\n",title[3],search_result.get(choice-1).getEng());
									System.out.printf("변경할 %s 점수를 입력하세요.",title[3]);
									updateNum = scan.nextInt();
									u.setEng(updateNum);
									break;
								case 3:
									System.out.printf("현재 %s 점수 : %d 점\n",title[4],search_result.get(choice-1).getMath());
									System.out.printf("변경할 %s 점수를 입력하세요.",title[4]);
									updateNum = scan.nextInt();
									u.setMath(updateNum);
									break;
								}//switch
								u.setTotal(u.getKor()+u.getEng()+u.getMath());
								u.setAvg(u.getTotal()/3.0);
								System.out.println("성적 수정이 완료되었습니다.");
								System.out.println("                       [ 성적 수정 결과 ]");
								System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
								// 상단타이틀
								for (int i = 0; i < title.length; i++) {
									System.out.printf("%s\t",title[i]);
								}
								System.out.println();
								System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
								System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",u.getNo(),u.getName(),u.getKor(),
										u.getEng(),u.getMath(),u.getTotal(),u.getAvg(),u.getRank());
							}else {
								u = stu_list.get(search_result.get(0).getNo()-1);
								System.out.println();
								System.out.println(search+" 학생 성적 수정");
								for (int i = 0; i < 3; i++) {
									System.out.printf("%d. %s 점수 수정\n",i+1,title[i+2]);
								}
								System.out.println("수정할 과목의 번호 입력하세요.");
								int update = scan.nextInt();
								switch(update) {
								case 1:
									System.out.printf("현재 %s 점수 : %d 점\n",title[2],search_result.get(0).getKor());
									System.out.printf("변경할 %s 점수를 입력하세요.",title[2]);
									updateNum = scan.nextInt();
									u.setKor(updateNum);
									break;
								case 2:
									System.out.printf("현재 %s 점수 : %d 점\n",title[3],search_result.get(0).getEng());
									System.out.printf("변경할 %s 점수를 입력하세요.",title[3]);
									updateNum = scan.nextInt();
									u.setEng(updateNum);
									break;
								case 3:
									System.out.printf("현재 %s 점수 : %d 점\n",title[4],search_result.get(0).getMath());
									System.out.printf("변경할 %s 점수를 입력하세요.",title[4]);
									updateNum = scan.nextInt();
									u.setMath(updateNum);
									break;
								}//switch
								u.setTotal(u.getKor()+u.getEng()+u.getMath());
								u.setAvg(u.getTotal()/3.0);
								System.out.println("성적 수정이 완료되었습니다.");
								System.out.println("                       [ 성적 수정 결과 ]");
								System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
								// 상단타이틀
								for (int i = 0; i < title.length; i++) {
									System.out.printf("%s\t",title[i]);
								}
								System.out.println();
								System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
								System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",u.getNo(),u.getName(),u.getKor(),
										u.getEng(),u.getMath(),u.getTotal(),u.getAvg(),u.getRank());
							}
							break;
						case 2:
							System.out.println("                       [ 학생 성적 삭제 ]");
							System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
							if(search_result.size()>1) {
								System.out.println("몇 번째 검색결과의 학생을 삭제하시겠습니까?");
								choice = scan.nextInt();
								u = stu_list.get(search_result.get(choice-1).getNo()-1);
							}else {
								u = stu_list.get(search_result.get(0).getNo()-1);
							}
							System.out.printf("정말 %s 학생 정보를 삭제하시겠습니까? 삭제시 복구가 불가합니다. 1.네/2.아니오\n",u.getName());
							choice = scan.nextInt();
							switch(choice) {
							case 1:
								stu_list.remove(u.getNo()-1);
								System.out.printf("%s 학생 데이터가 삭제되었습니다.\n",u.getName());
								break loop;
							default:
								break;
							}
							break;
						case 3:
							break loop;
							}
						}//수정 삭제switch
			}
		}//while
	}//stu_update
	
	// 등수처리
	void stu_rank() {
		System.out.println("                       [ 성적 등수 처리 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (int i = 0; i < stu_list.size(); i++) {
			rankC = 1;
			for (int j = 0; j < stu_list.size(); j++) {
				if(stu_list.get(i).getTotal()<stu_list.get(j).getTotal()) {
					rankC++;
				}stu_list.get(i).setRank(rankC);
			}
		}
		System.out.println("                 *** 등수처리가 완료되었습니다. ***");
	}//stu_rank
	
	//파일 저장
	void stu_dataSave() {
		try {
			System.out.println("저장할 파일명을 입력하세요.");
			String fileName = scan.next();
			FileWriter fw = new FileWriter(String.format("c:/save/%s.txt", fileName));
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < stu_list.size(); i++) {
				Stu s = stu_list.get(i);
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
