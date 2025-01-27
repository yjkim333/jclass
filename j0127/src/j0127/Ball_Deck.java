package j0127;

import java.util.Scanner;

public class Ball_Deck {
	Scanner scan = new Scanner(System.in);
	Ball[] b = new Ball[45];
	int[] lottoNo = new int[6];
	int[] inputNo = new int[6];
	int[] answer = new int[6]; 
	int count = 0;
	
	
	// ball 45개 생성
	Ball_Deck() {
		for(int i = 0; i < 45; i++) {
			b[i] = new Ball(i+1);
		}
	}

	// 섞기
	void shuffle() {
		for (int i = 0; i < 500; i++) {
			int randomNo = (int)(Math.random()*45);
			Ball temp = new Ball();
			temp = b[0];
			b[0] = b[randomNo];
			b[randomNo] = temp;
		}
	}
	
	
	// 로또번호6개 추출
	void lotto() {
		for (int i = 0; i < 6; i++) {
			lottoNo[i] = b[i].getNum();
		}
	}
	
	// 숫자 입력
	void num_input() {
		for(int i=0;i<6;i++) {
			System.out.println(i+1+"번째 숫자를 입력하세요.");
			int num = scan.nextInt();
//			if(num>=1 && num<=45) {
//				inputNo[i] = num;
//				System.out.println("num : "+ num);
//			}else {
//				System.out.println("숫자는 1~45까지만 입력 가능합니다.");
//				System.out.println("다시 입력하세요.");
//				i--;
//			}
			if(num<1 || num>45) {
				System.out.println("숫자는 1~45까지만 입력 가능합니다.");
				System.out.println("다시 입력하세요.");
				i--;
			}else {
				inputNo[i] = num;
			}
		}
	}//num_input
	
	
	// 로또 당첨 확인
	void check() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(inputNo[i] == lottoNo[j]) {
					answer[count] = lottoNo[j];
					count++;
				}
			}
		}
		// 결과 출력
		System.out.print("입력 숫자 : ");
		for (int i = 0; i < inputNo.length; i++) {
			System.out.print(inputNo[i]+"\t");
		}
		System.out.print("\n로또 번호 : ");
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.print(lottoNo[i]+"\t");
		}
		System.out.printf("\n맞힌 개수 : %d개",count);
		if(count!=0) {
			System.out.print("\n맞힌 번호 : ");
			for (int i = 0; i < count; i++) {
				System.out.print(answer[i]+"\t");
			}
		}
	}//check
	
}//class
