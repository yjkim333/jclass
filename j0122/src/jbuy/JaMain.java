package jbuy;

import java.util.Scanner;

public class JaMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 로그인 구현
		// 보유한 금액, 보너스 포인트 설정
		Buyer b = new Buyer(); // b - 10000000원 0포인트
		
		loop:while(true) {
			System.out.println("[  전자제품 쇼핑몰  ]");
			System.out.println("1. TV");
			System.out.println("2. COMPUTER");
			System.out.println("3. AUDIO");
			System.out.println("9. 구매내역(cart) 보기");
			System.out.println("0. 쇼핑몰 종료");
			System.out.println("구매를 원하는 상품 번호를 입력하세요.");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				//Tv t = new Tv();
				b.buy(new Tv());
				b.my_info();
				System.out.println();
				break;
			case 2:
				b.buy(new Computer());
				b.my_info();
				System.out.println();
				break;
			case 3:
				b.buy(new Audio());
				b.my_info();
				System.out.println();
				break;
			case 9:
				b.cart_info();
				break;
			case 0:
				System.out.println("[---종료---]");
				break loop;
			}//switch
			
		
		}//while
		
		
		
	}//main

}
