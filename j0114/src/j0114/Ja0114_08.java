package j0114;

import java.util.Scanner;

public class Ja0114_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 조건문 - if / switch
		// 반복분 - for / while
		
		
		
		
//		// 반복문을 사용하여 000~999까지 출력하시오.
//		// 000, 001, 002,...,999
//		
//		for(int i=0;i<1000;i++) {
//			System.out.printf("%03d \n",i);
//		}
		
//		double num = Math.random(); // 0.000000000000.. <= x < 1.00000000000...
//		System.out.println(num);

		// 1~100
//		for (int i=0;i<20;i++) {
//			int ran = (int)(Math.random()*100+1);
//			System.out.println(ran);
//			
//		}
		
		// 1-100 까지 랜던숫자 입력받아 10번을 입력해서 숫자맞추기 게임을 구현하시오
		// 10번 이후에는 정답을 공개하시오.
		
//		int rnum = (int)(Math.random()*100+1);
//		int i = 0;
//		int temp = 0;
//		while(i<10) {
//			System.out.println(i+1+"번째 도전! 숫자를 입력하세요.");
//			int inum = scan.nextInt();
//			if(rnum==inum) {
//				System.out.println("정답!");
//				temp = 1;
//				break;
//			}else if(inum<rnum) {
//				System.out.println("오답! 더 큰 수 입력해 보세요.");
//				System.out.println();
//			}else
//				System.out.println("오답! 더 작은 수 입력해 보세요.");
//				System.out.println();
//			i++;
//		}
//		if(temp==0) {
//			System.out.println("10번 기회를 모두 썼어요. 정답은 "+rnum);
//		}
		
		
		
		// 기본형 타입 8가지- boolean, char, byte, short, int, long, float, double
		// 기본형 타입은 == 등가비교 가능
		
		
//		int num = 10;
//		int num2 = 10;
//		if(num == num2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
//		String str = "안녕하세요.";
//		String str2 = "안녕";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//		
//		System.out.println(str);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		System.out.println("------------------------");
//		
//		if(str == str4) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		System.out.println("------------------------");
//		
//		if(str == str2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		System.out.println("------------------------");
//		
//		if(str == str3) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		System.out.println("------------------------");
//
//		// 8가지 기본형 타입 이외 비교 => .equals() 사용
//		if(str.equals(str4)) {
//			System.out.println("equals비교 => 같습니다.");
//		}else {
//			System.out.println("equals비교 => 다릅니다.");
//		}
		
		// 파이썬에서 리스트 주소값으로 비교 하는것 과 같음
		// String-> 2개 이상의 값을 저장하기때문에 == 등가비교 안됨.
		
		
//		String str = "홍길동";
//		System.out.println("이름을 입력하세요. >> ");
//		String input = scan.next();
//		
//		if(str.equals(input)) {
//			System.out.println("홍길동이 맞습니다.");
//		}else {
//			System.out.println("홍길동이 아닙니다.");
//		}
//		
		
		
//		// break - 반복분 중지 => 가장 가까운 for문을 빠져나옴.
//		// continue - 1 번만 중지
//		for(int i=2;i<=9;i++) {
//			if(i%2==1) {
//				continue;
//			}
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d =%d \n",i,j,i*j);
//			}
//		}
		
		
		
		
	}

}
