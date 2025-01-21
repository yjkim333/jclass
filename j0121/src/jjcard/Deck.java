package jjcard;

class Deck {
	
	final int CARD_NUM = 52; // 카드 숫자
	Card[] c = new Card[CARD_NUM];
	
	// 카드 생성 - 번호부여 메서드
	void input() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	}//input
	
	
	// 카드 개수 출력 - 전체:52
	void print(int cnt) {
		System.out.printf("[  %d장 출력  ]\n",cnt);
		for(int i=0;i<cnt;i++) {
			System.out.println(c[i]); // Card에 toString으로.
		}
	}//print
	
	
	// 카드 해당 번호 출력
	void print(Card c) {
		System.out.printf("[  선택 카드 출력  ]\n");
		System.out.println(c); // Card에 toString으로.
	}//print
	
	
	// 카드 섞기
	void shuffle() {
		Card temp = null;
		for(int i=0;i<500;i++) {
			int randomN = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[randomN];
			c[randomN] = temp;
		}
	}//shuffle
	
	
	// 카드 1장 뽑기
	Card pick(int no) {
		if(no>=0 && no<=51) {
			return(c[no]);
		}else {
			System.out.println("[경고] 올바른 숫자를 입력하세요.");
			return(c[0]);
		}
	}//pick
	
	
	
	
	
}
