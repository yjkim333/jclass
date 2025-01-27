package j0127;

public class LottoMain {

	public static void main(String[] args) {
		// 1. ball 객체
		// 2. ball_deck 객체
		// - ball 45개 생성, ball 숫자 입력, ball 섞기
		// - 6개 로또 번호 추출, 6개 숫자 입력, 로또번호와 입력번호 비교
		// - 출력 화면
		// 3. main 에서 로또 프로그램
		// - 6개 숫자 입력 받아, 로또 번호와 비교해서 몇 개 맞췄는지 확인
		
		Ball_Deck bd = new Ball_Deck();
		bd.shuffle();
		bd.lotto();
		bd.num_input();
		bd.check();
		
	}

}
