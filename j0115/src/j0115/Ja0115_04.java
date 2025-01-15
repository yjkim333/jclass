package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1-100 랜덤숫자를 생성
		// 10번 도전 기회 - 정답 시 종료
		// 입력한 숫자가 랜던 숫자보다 큰지 작은지
		// 입력한 숫자 모두 출력
		// 랜덤 숫자 :
		// 입력한 숫자 :
		// 도전 횟수 :
		
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*100+1);
		int[] input = new int[10];
		int count = 0;
		int temp = 0;
		
		for(int i=0;i<input.length;i++) {
			System.out.println(i+1+"번째 기회");
			input[i] = scan.nextInt();
			if(rnum == input[i]) {
				System.out.println("정답입니다. 랜덤 숫자 : "+rnum);
				temp = 1;
				break;
			} else if(rnum>input[i]) {
				System.out.println("오답! 더 큰 수를 입력해보세요.");
			} else {
				System.out.println("오답! 더 작은 수를 입력해보세요.");
			}
			count++;
		}
		
		if(temp == 0) {
			System.out.println("10번 기회를 모두 사용하였습니다.");
			System.out.println("정답은 "+rnum);
			System.out.printf("도전 횟수 : %d 회 \n",count);
			for(int i=0;i<count;i++) {
				if(i == count-1) {
					System.out.print("입력숫자 : "+input[i]);
				}else {
					System.out.print("입력숫자 : "+input[i]+", ");
				}
				
			}
		}else {
			System.out.printf("도전 횟수 : %d 회 \n",count);
			for(int i=0;i<count;i++) {
				if(i == count-1) {
					System.out.print("입력숫자 : "+input[i]);
				}else {
					System.out.print("입력숫자 : "+input[i]+", ");
				}
			}
		}
		
	}

}
