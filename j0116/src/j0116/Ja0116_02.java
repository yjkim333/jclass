package j0116;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ja0116_02 {

	public static void main(String[] args) {
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		int[] num2 = {1,2};
//		// 얕은 복사
//		num2 = num;
//		
//		num[0] = 200;
//		
//		System.out.println(Arrays.toString(num2));
		
//		int n = 10;
//		int n2 = 0;
//		
//		n2 = n;
//		n = 100;
//		
//		System.out.println(n);
//		System.out.println(n2);
		
		
		
		
//		// 1차원 배열
//		int[] num = new int[5];
//		// 번호 입력
//		for(int i=0;i<5;i++) {
//			num[i] = i+1;
//		}
//		
//		// 번호 출력
//		for(int i=0;i<5;i++) {
//			System.out.print(num[i]+"\t");
//		}

		
		
//		// 2차원 배열
//		int[][] score = new int[5][5];
//		
//		// 1-25 입력
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score.length;j++) {
//				score[i][j] = (5*i)+j+1;
//			}
//		}
//		
//		// 출력
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score.length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
//		// 1-24
//		int[][] score = new int[4][6];
//		
//		// 입력
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score.length;j++) {
//				score[i][j] = (6*i)+j+1;
//			}
//		}
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score.length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6];
////		num[5] = 6; 에러
//		System.out.println(Arrays.toString(num));
//
//		
//		// 배열 복사
//		for(int i=0;i<num.length;i++) {
//			num2[i] = num[i];
//		}
//		
//		num = num2;
//		num2[5] = 6;
//		
//		System.out.println(Arrays.toString(num));
		
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6];
		
//		num[3] = 0;
//		System.out.println(Arrays.toString(num));
		
		
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6];
//		
////		System.arraycopy(num, 0, num2, 0, 5);
//		System.arraycopy(num, 2, num2, 3, 3);
//		
//		System.out.println(Arrays.toString(num2));
//		
		
		
//		String input = JOptionPane.showInputDialog("1-100까지 숫자를 입력하세요.");
//		System.out.println("입력숫자 : "+input);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1를 입력하세요. ");
		String input = scan.next();
		System.out.println("숫자2를 입력하세요. ");
		String input2 = scan.next();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("입력한 숫자 더하기 : "+(num+num2));
		
		
		
		
		
		
		
	}

}
