package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		// 1-5까지 랜덤숫자를 생성해서 
		// 5번 입력받아 랜던 숫자를 몇번 맞췄는지 개수 출력
		// 입력했던 숫자 모두 출력
		
		// 랜덤 숫자 :  정답 횟수 :  입력숫자:  
		Scanner scan = new Scanner(System.in);
		
		int rnum = (int)(Math.random()*5)+1;
		int input[] = new int[5];
		int count = 0;
		for (int i=0;i<input.length;i++) {
			System.out.println(i+1 + "번째 기회");
			input[i] = scan.nextInt();
			if(input[i] == rnum) {
				System.out.println("정답!");
				count += 1;
			}else {
				System.out.println("오답입니다.");
			}
		}
		System.out.println("랜덤 숫자 : "+rnum);
		System.out.println("정답 횟수 : "+count);
		for (int i=0;i<input.length;i++) {
			System.out.println(i+1+"번째 입력한 숫자 : "+input[i] );
			
		}
		
		System.out.println("입력 숫자 : "+Arrays.toString(input));
		System.out.printf("입력 숫자 : %s",Arrays.toString(input));
		
		
	}

}
