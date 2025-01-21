package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		// Card 52장을 생성한 후 1-13. Spade,Diamond,Heart,Clover 출력
		
		Deck d = new Deck();
//		System.out.println(d.c[0].number);
//		System.out.println(d.c[0].shape);
//		System.out.printf("[ %s, %d ]\n",d.c[0].shape,d.c[0].number);
		
		// 전체출력
		d.print_all(52);
		
		// 섞기 실행
		d.shuffle();
		
		// 10번째 카드를 선택
		Card c = d.pick(10);
		d.print_all(c);
		
		// 5장출력
		d.print_all(5);
		d.print_all(1);

		
		
		
		
		
		
		// ----------------------------------------------------------------------
		
//		Card[] c = new Card[52];
//		String[] shape = {"Spade","Diamond","Heart","Clover"};
//		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
//		
//		for (int i = 0; i < shape.length; i++) {
//			for (int j = 0; j < 13; j++) {
//				c[i*13+j] = new Card(shape[i],j+1);
//			}
//		}
		
		
//		// 카드 전체 출력
//		for (int i = 0; i < shape.length; i++) {
//			for (int j = 0; j < 13; j++) {
//				System.out.printf("[ %s, %s ]\n",c[i*13+j].shape,n[c[i*13+j].number]);
//			}
//		}
		
//		// 섞기
//		Card temp = new Card(); 
//		int ranN = 0; 
//		for (int i = 0; i < 500; i++) {
//			ranN = (int)(Math.random()*52);
//			temp = c[0];
//			c[0] = c[ranN];
//			c[ranN] = temp;
//		}
//		
//		
//		// 랜덤 섞기 후 5개 출력
//		System.out.println("[ 랜덤 5장 ]");
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("[ %s, %s ]\n",c[i].shape,n[c[i].number]);
//		}
		
		
	}//main

}
