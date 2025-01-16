package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_01 {

	public static void main(String[] args) {
		// 배열
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//
//		System.out.println(num); // num 주소값
//		System.out.println(num[0]);
		
		
//		int[] num2 = {1,2,3,4,5};
//		
//		
//		int[] num3 = new int[5];
//		for(int i=0;i<num3.length;i++) {
//			num3[i] = i+1;
//		}
//		
		
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		

		// 1. 1-45 번호 생성
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		// 1. 1-45 번호 출력
//		for (int i=0;i<ball.length;i++) {
//			System.out.print(ball[i]+" ");
//		}
//		System.out.println();
		
		// 2. 번호 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int randomN = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[randomN];
			ball[randomN] = temp; 
		}
		
		// 3. ball 6개 숫자 -> 로또 번호 6개 복사
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		
		
		// 4. 번호 입력
		for(int i=0;i<lotto.length;i++) {
			System.out.printf("%d번째 번호를 입력하세요. >> \n",i+1);
			input[i] = scan.nextInt();
		}

		// 5. 입력번호와 로또번호 비교
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i] == lotto[j]) {
					answer[count]=input[i];
					count++;
					break;	
				}
			}
		}
		
		//출력
		System.out.println("     [ 로또 번호 확인 ]");
		System.out.println("----------------------------");
		System.out.printf("로또 번호 : %s\n",Arrays.toString(lotto));
		System.out.printf("입력 번호 : %s\n",Arrays.toString(input));
		System.out.printf("맞춘 개수 : %d\n",count);
		System.out.print("맞춘 번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println();
		
		
		
		
	}

}
