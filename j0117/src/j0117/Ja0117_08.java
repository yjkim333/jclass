package j0117;

public class Ja0117_08 {

	public static void main(String[] args) {
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 1;
//		
//		Card c2 = new Card();
//		c2.kind = "Clover";
//		c2.number = 2;
//		
//		System.out.printf("[ %s, %d ] \n",c1.kind,c1.number);
//		System.out.printf("크기 : %d x %d \n",c1.width,c1.height);
//		
//		// width,height
//		c2.width = 50;
//		c2.height = 70;
//		
//		System.out.printf("[ %s, %d ] \n",c1.kind,c1.number);
//		System.out.printf("크기 : %d x %d \n",c1.width,c1.height);
		
		
		
		// 카드 모양 - spade heart diamond clover
		// 숫자 - 1(A),2,3,4,5,6,7,8,9,10,11(J),12(Q),13(K)
		// 총 카드 수 : 13*4 = 52장
		
		// spade 13장
		String[] shape = {"spade","heart","diamond","clover"};
		Card[] c = new Card[52];
//		c[0].kind = "spade";
//		c[0].number = 1;
		for(int i=0;i<c.length;i++) {
			// 객체선언
			c[i] = new Card();
			c[i].kind = shape[i/13];
			c[i].number = (i%13)+1;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("[%s,%d]\n",c[i].kind,c[i].number);
		}
		
		

		
		
		
		
		
		
		
	}

}
