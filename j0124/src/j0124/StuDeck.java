package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	int choice = 0, temp = 0, count = 0, searchNo =0;
	
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	// 성적 데이터 파일 읽어오기
	void fileRead() throws Exception {
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		int kor = 0, eng = 0, math = 0;
		String name = "";
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			list.add(new Stu(name,kor,eng,math));
		}
		br.close();
		fr.close();
	}//fileRead
	
	// list 출력
	void listPrint() {
		System.out.println("                       [ 학생 성적 출력 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
	}//listPrint
	
	// 학생 성적 삭제
	void remove() {
		System.out.println("                       [ 학생 성적 삭제 ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("삭제할 학생의 이름을 검색하세요.");
		String search = scan.next();
		temp=0;
		for (int i = 0; i < list.size(); i++) {
			Stu s = list.get(i);
			if(search.equals((s.getName()))){
				searchNo = i;
				temp = 1;
				break;
			}
		}
		if(temp == 0) {
			System.out.println("검색한 학생의 데이터가 없습니다.");
		}else {
			System.out.printf("%s 학생의 성적을 삭제하시겠습니까? y/n \n",search);
			String answer = scan.next();
			if(answer.equals("y")) {
				list.remove(searchNo);
				System.out.println(search+"학생의 데이터가 삭제되었습니다.");
			}else {
				System.out.println("성적 삭제를 취소합니다.");
			}
		}
	}//remove
	
	// 파일저장
	void saveFile() throws Exception {
		FileWriter fw = new FileWriter("c:/save/save.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < list.size(); i++) {
			Stu s = list.get(i);
			String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", 
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			bw.write(str);
		}
		bw.close();
		fw.close();
		System.out.println("성적 데이터가 save.txt에 저장되었습니다.");
	}//saveFile
	
}
	


