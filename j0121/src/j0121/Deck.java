package j0121;

public class Deck {
	// 카드에 사용되는 메서드
	
	
	Card[] c = new Card[52];
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	
	//생성자
	Deck(){
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	// 카드 전체 출력 메서드
	void print_all(int no) {
		System.out.println();
		System.out.printf("      [ %d장 출력 ] \n",no);
		System.out.println("=====================");
		for (int i = 0; i < no ; i++) {
			System.out.printf("[ %s, %s ]\n",c[i].shape,n[c[i].number]);
		}
	}//print_all
	// 카드 전체 출력 메서드 // ^ 오버로딩
	void print_all(Card c) {
		System.out.println();
		System.out.printf("     [ 선택 카드 확인 ] \n");
		System.out.println("=========================");
		System.out.printf("[ %s, %s ]\n",c.shape,n[c.number]);
	}//print_all
	
	
	// 카드 섞기 메서드
	void shuffle() {
		Card temp = new Card(); 
		int ranN = 0; 
		for (int i = 0; i < 500; i++) {
			ranN = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ranN];
			c[ranN] = temp;
		}
	}//shuffle
	
	
	// 카드 한장 선택
	Card pick(int no) {
		if(no>=0 && no<=51) {
			return c[no];
		}else {
			System.out.println("[경고] 번호를 확인하세요.");
			return c[0];
		}
	}
	

	
	
//	final int CARD_NUM = 52;
//	Card[] c = new Card[CARD_NUM]; // Card 배열
	
}
