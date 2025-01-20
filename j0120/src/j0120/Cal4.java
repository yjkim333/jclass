package j0120;

import java.util.Scanner;

public class Cal4 {
	
	void input(String[] name,int[] kor) {
		Scanner scan = new Scanner(System.in);
		//이름 3명 국어점수3개 입력
		for(int i=0;i<name.length;i++) {
			System.out.println(i+1+"번 이름 입력");
			name[i]=scan.next();
			System.out.println(i+1+"번 국어점수 입력");
			kor[i]=scan.nextInt();

		}
	}

}
