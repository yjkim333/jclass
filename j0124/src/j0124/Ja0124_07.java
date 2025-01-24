package j0124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Ja0124_07 {

	public static void main(String[] args) {
		
		// c:/save/stu.txt 파일을 읽어와서
		// list.add 로 list 에 넣어라
		ArrayList<Stu> list = new ArrayList<Stu>();
		
		try {
			FileReader fr = new FileReader("c:/save2/stu.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String [] str = line.split(",");
				
				String name = str[1];
				int kor = Integer.parseInt(str[2]); 
				int eng = Integer.parseInt(str[3]); 
				int math = Integer.parseInt(str[4]);
				list.add(new Stu(name,kor,eng,math));
				
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 리스트 출력
		for (int i = 0; i < list.size(); i++) {
		Stu s = list.get(i);
		System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		
	}

}
