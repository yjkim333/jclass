package j0115;

public class Ja0115_01 {

	public static void main(String[] args) {
//		String str = new String("abc");
//		String str2 = "abc";
//		System.out.println(str);
//		System.out.println(str2);
//		
//		if(str == str2) {
//			
//		}
//		
//		if(str.equals(str2)) {
//			
//		}
		
		
//		----------------------------------
		// 배열(array) - 같은 타입의 여러 변수를 하나의 묶음으로.
		
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		
//		System.out.println(score); // 주소값 출력
//
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
		
		
		
//		int[] num = new int[10];
//		
//		for(int i=0;i<10;i++) {
//			num[i] = i;
//		}
//				
//		// 출력
//		for(int i=0;i<10;i++) {
//			System.out.println(num[i]);
//		}
		
		
//		int[] score; // 배열선언 - 생성된 배열을 다루는데 사용될 참조변수 선언 - 저장공간 생성x
//		int[] score1 = new int[5]; // 배열생성

		
//		// 배열 데이터 넣기
//		// 1.
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
//		
//		// 2.
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(score2[0]);
//		
//		// 3.
//		int[] score3 = new int[10];
//		for (int i=0;i<10;i++) {
//			score3[i] = i+1;
//		}
//		
		
		
		
		// score 배열 100개를 만들어서 1-100까지 숫자를 입력해서 출력하시오
//		int[] score = new int[100];
//		int sum = 0;
//		
//		for (int i=0;i<100;i++) {
//			score[i] = i+1;
//			sum += score[i];
//			
//			System.out.println(score[i]);
//		}
//		System.out.println(sum);
		
		// 1-10까지의 랜덤숫자를 입력해서 합계를 출력하시오
		
		int[] score1 = new int[10];
		int sum1 = 0;
		for(int i=0;i<10;i++) {
			int rnum = (int)(Math.random()*10+1);
			score1[i] = rnum;
			sum1 += score1[i];
			System.out.println(i+"랜덤숫자:"+rnum);
			
		}
		System.out.println("합계 : "+sum1);;
		
		
		
		
		
		
		
		
		
		
		
	}

}
