package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 배열저장 5개의 값을 출력하고 합계 출력
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			System.out.println((i+1)+"번째 숫자입력 >>");
			num[i] = scan.nextInt();
//			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("sum : "+sum);
		
		
	}

}
