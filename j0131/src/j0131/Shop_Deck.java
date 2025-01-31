package j0131;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Shop_Deck {
	Scanner scan = new Scanner(System.in);
	Buyer user1;  // user 아이디
	ArrayList<Product> list = new ArrayList<Product>(); // 상품구매리스트 
	int choice = 0;
	
	// 로그인 메서드
	void login() {
		while(true) {
			System.out.println();
			System.out.println("  [  쇼핑몰 프로그램  ]");
			System.out.println("---------------------");
			System.out.println("로그인을 하셔야 쇼핑몰에 접근 가능합니다.");
			System.out.println("<  로그인  >");
			System.out.print("아이디 : ");
			String id = scan.next();
			System.out.print("비밀번호 : ");
			String pw = scan.next();
			System.out.println();
			if(id.equals("admin") && pw.equals("1111")) {
				// DB접근
				user1 = new Buyer("admin","1111","관리자","서울",100000000,10000000);
				System.out.printf("[ %s님 회원정보 ]\n",user1.getUserName());
				System.out.println("---------------------");
				System.out.println(id+"님 환영합니다.");
				System.out.printf("보유금액 : %,d 원 \n", user1.getMoney());
				break;
			}else {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			}
		}//while
	}//login
	
	// 화면 출력
	int mainPrint() {
		System.out.println();
		System.out.println("  [  쇼핑몰 프로그램  ]");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(" 1. 50인치 LED TV");
		System.out.println(" 2. 75인치 LED TV");
		System.out.println(" 3. 노트북");
		System.out.println(" 4. 냉장고");
		System.out.println(" 5. 세탁기");
		System.out.println(" 6. 배송지, 색상");
		System.out.println(" 7. 구매 리스트");
		System.out.println(" 8. 현금 충전");
		System.out.println(" 9. 상품등록 - 관리자");
		System.out.println(" 0. 프로그램 종료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		return choice;
	}
	
	
	// 상품구매
	void buy(Product p) {
		p.getPrice(); // 제품금액
		p.getPoint(); // 제품포인트
		user1.setMoney(user1.getMoney()-p.getPrice());  // user 보유금액-제품금액
		user1.setMy_point(user1.getMy_point()+p.getPoint()); // user 보유포인트+제품포인트
		list.add(p);
		System.out.println("[ 구매 상품 ]");
		System.out.println("--------------------------");
		System.out.println("상품 : "+p.getName());
		System.out.printf("금액 : %,d 원\n",p.getPrice());
		System.out.printf("보유 금액 : %,d 원\n",user1.getMoney());
		System.out.println("--------------------------");
	}//buy
	
	// 구매리스트
	void buy_list() {
		System.out.println("[ 구매 리스트 ]");
		System.out.println("--------------------------");
		if(list.isEmpty()) {
			System.out.println("구매 내역이 없습니다.");
		}else {
			int total = 0;
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d. %s, %,d원\n",i+1,list.get(i).getName(),list.get(i).getPrice());
				total += list.get(i).getPrice();
			}
			System.out.println("--------------------------");
			System.out.printf("총 구매 개수 : %d 개\n",list.size());
			System.out.printf("총 구매 금액 : %,d 원\n",total);
		}
	}//buy_list
	
	// 현금 충전
	void cash() {
		System.out.println("[ 현금 충전 ]");
		System.out.println("--------------------------");
		System.out.printf("현재 보유 금액 : %,d 원\n",user1.getMoney());
		System.out.println("충전하실 금액을 입력하세요.");
		user1.setMoney(user1.getMoney()+scan.nextInt());
		System.out.println("충전이 완료되었습니다.");
		System.out.println("--------------------------");
		System.out.printf("현재 보유 금액 : %,d 원\n",user1.getMoney());
	}//cash
	
}
