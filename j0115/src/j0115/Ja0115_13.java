package j0115;

import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또 맞추기
		
		// 1-45까지 로또번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		//1. 변수선언
		//2. 1-45 번호저장
		//3. 배열섞기
		//4. 6개 로또번호
		//5. 입력창만들기
		// 6. 맞춘번호 확인 - input,lotto
		// 7. 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[  로또 맞추기  ]");
		
		// 1-45 번호 저장
		int[] balls = new int[45];
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		
		// 배열 섞기
		int temp = 0;
		for(int i=0;i<600;i++) {
			int ran = (int)(Math.random()*45);
			temp = balls[0];
			balls[0] = balls[ran];
			balls[ran] = temp; 
		}
		
		// 로또 번호 6개
		int[] lotto = new int[6];
		for(int i=0;i<6;i++) {
			lotto[i] = balls[i];
		}
		// 로또 번호 6개 출력
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
		
		// 입력창 만들기
		int[] input = new int[6]; // 입력번호
		for(int i=0;i<lotto.length;i++) {
			System.out.println((i+1)+"번째 번호를 입력하세요.");
			input[i] = scan.nextInt();
		}
		
		// 맞는 번호 확인
		int count = 0; // 정답개수
		int[] answer = new int[6]; // 정답저장
		
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length;j++) {
				if(input[i] == lotto[j]) {
					answer[count]=input[i];
					count++;
					break;
				}
			}
		}
		
		
		// 출력
		System.out.println("[ 로또번호 확인 ]");
		// 입력번호
		System.out.print("입력 번호 : ");
		for (int i=0;i<lotto.length;i++) {
			System.out.print(input[i]+"\t");
		}
		System.out.println();
		// 로또번호
		System.out.print("로또 번호 : ");
		for (int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+"\t");
		}
		System.out.println();
		// 맞힌 개수
		System.out.print("맞힌 개수 : ");
		System.out.println(count);

		// 맞힌 번호
		for (int i=0;i<count;i++) {
			System.out.print("맞힌 번호 : ");
			System.out.print(answer[i]+"\t");
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
