package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_05 {

	public static void main(String[] args) {
		// 이름, 국어점수 -> 5명의 국어 영어성적 과 평균을 입력하려함
		Scanner scan = new Scanner(System.in);
		
//		String name; // 변수 초기화 x => 무조건 초기화 해.
//		String name = ""; // 변수 초기화
//		int kor = 0;
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		// 이름 국어 영어 입력받아 합계 평균 출력 - 평균출력은 소수점 3자리까지
		
		for (int i=0;i<name.length;i++) {
			System.out.println(i+1+"번째 이름을 입력하세요 >>");
			name[i] = scan.next();
			System.out.println(i+1+"번째 학생 국어점수를 입력하세요 >>");
			kor[i] = scan.nextInt();
			System.out.println(i+1+"번째 학생 영어점수를 입력하세요 >>");
			eng[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]; 
			avg[i] = total[i]/2.0;
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(eng));
		System.out.println(Arrays.toString(total));
		for(int i=0;i<avg.length;i++) {
			System.out.printf("평균 : %.3f ",avg[i]);
		}
		
		
	}

}
