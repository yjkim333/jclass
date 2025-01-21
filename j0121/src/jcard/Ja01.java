package jcard;

public class Ja01 {

	public static void main(String[] args) {
		// 52장 카드 생성-> 52장 카드를 순차적으로 출력
		// 랜덤 섞기해서 52장 출력
		// 0-51까지 숫자를 입력받아 해당 되는 카드를 출력
		
		Deck d = new Deck();
		
//		d.print(52);
		
		d.shuffle();
		
		// 카드 1장 선택
		Card c = d.pick();
		// 선택카드 출력
		d.print(c);
		
		
		d.print(5);
		
	}//main

}
