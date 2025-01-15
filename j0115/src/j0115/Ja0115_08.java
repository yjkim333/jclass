package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10 까지 랜덤숫자를 입력받아 동일한 번호가 없게 저장하시오
		
//		int[] num = new int[10];
//		
//		// while
//		int i = 0;
//		loop:while(i<10) {
//			int ran = (int)(Math.random()*10)+1;
//			for(int j=0;j<i;j++) {
//				if (num[j]==ran) {
//					System.out.println("동일숫자 : "+ran);
//					continue loop;
//				}
//			}
//			num[i] = ran;
//			i++;
//		}
//		
//		System.out.print("번호 : ");
//		for(int j=0;j<num.length;j++) {
//			System.out.print(num[j]+"  ");
//		}
		
		
		
		// 배열섞기
		int[] num = new int[10];
		int temp = 0;
		for(int i=0;i<num.length;i++ ) {
			num[i] = i+1;
		}
		for (int j=0;j<100;j++) {
			int ranN = (int)(Math.random()*10);
			temp = num[0];
			num[0]=num[ranN];
			num[ranN]=temp;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"  ");
		}
		
		
	}

}
