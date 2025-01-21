package j0121;


public class Ja0121_02 {

	public static void main(String[] args) {

		Card[] c = new Card[52]; // Card 배열
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] shape = {"Spade","Diamond","Heart","Clover"};
		
		// "Spade","Diamond","Heart","Clover"
		// A,2,3,4,5,6,7,8,9,10,J,Q,K
		
		//입력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				c[i*13+j] = new Card(shape[i],j+1); 
			}
		}
		
		// 출력
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 13; j++) {
//				System.err.printf("[ %s , %d ] \n",c[i*13+j].shape,c[i*13+j].number);
//			}
//		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.err.printf("[ %s , %s ] \n",c[i*13+j].shape,n[c[i*13+j].number]);
			}
		}
		
		System.out.println(c[11]);
		System.out.printf("[%s,%s]\n",c[11].shape,n[c[11].number]);
		System.out.println(c[0].shape);
		System.out.println(c[0].number);
		
		for(int i=0;i<52;i++) {
			System.out.println(c[i]);
		}
		
	}

}
