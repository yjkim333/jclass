package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
		// sort
//		int[] num = {1,9,13,28,5,20,7};
//		Integer[] num2 = {1,9,13,28,5,20,7};
//		System.out.println(Arrays.toString(num));
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
		// 역순 정렬
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));
		
		
		
		// 
		Scanner scan = new Scanner(System.in);
		
		String[] balls = new String[45];
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1+""; // +""해서 문자로 변경함
		}
		
		int[] input = new int[6];
		
		int k = 0;
		while(k<6) {
			
		System.out.print("	  [  로또 맞추기  ]");
		
		for(int i=0;i<balls.length;i++) {
			if(i%5==0) {
				System.out.println();
			}
			System.out.print(balls[i]+"\t");
			
		}
		
		System.out.println();
		System.out.println("원하는 번호를 입력하세요 >> 입력 "+(k+1)+"번째");
		input[k] = scan.nextInt();
		
		// 입력한 번호 5 => 5를 x로
		
		balls[input[k]-1] = "X";
		
		k++;
		
		
		// 입력한 번호 5 => 5를 x로
		// ball[5-1] = "x";
		// ball[input-1] = "x";
		
		
		
		
		}
		
		
		
		
		
	}

}
