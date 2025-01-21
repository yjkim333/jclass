package jcard;

import java.util.Scanner;

public class Deck {
	Scanner scan = new Scanner(System.in);
	Card[] c = new Card[52];
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	
	// 기본생성자 - 카드 52장 생성
	Deck(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j]= new Card(s[i],j+1);
			}
		}
	}
	
	// 카드 출력 메서드
	void print(int no) {
		System.out.println();
		System.out.printf("[ 카드 %d장 출력 ]\n",no);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i=0;i<no;i++) {
			System.out.printf("[ %s, %s ]\n",c[i].shape,n[c[i].number]);
		}
	}//print
	void print(Card c) {
		System.out.println();
		System.out.printf("[ 선택 카드 확인 ]\n");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.printf("[ %s, %s ]\n",c.shape,n[c.number]);
	}//선택카드 print
	
	// 섞기 메서드
	void shuffle() {
		Card temp = new Card();
		int ranN = 0;
		for (int i=0;i<300;i++) {
			ranN = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ranN];
			c[ranN] = temp;
		}
	}//shuffle
	
	// 카드 한장 선택 메서드
	Card pick() {
		System.out.println();
		System.out.println("선택할 카드번호를 입력하세요.(0-51)");
		int no = scan.nextInt();
		if(no>=0 && no<=51) {
			return(c[no]);
		}else {
			System.out.println("[경고] 올바른 숫자를 입력하세요.");
			return(c[0]);
		}
	}
	
	
}
