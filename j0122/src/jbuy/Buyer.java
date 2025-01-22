package jbuy;

import java.util.ArrayList;

class Buyer {
	int total = 0;
	int count = 0; // 상품구매개수
	int money = 10000000; // 보유 현금
	int bonusPoint = 0;   // 보유 포인트
//	Product[] cart = new Product[10]; // 배열선언_구매내역
	ArrayList list = new ArrayList();
	//	Cart[0] = new Product();
	
	// 생성자
	Buyer(){}
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 나의 정보
	void my_info() {
		System.out.printf("[ 보유 금액 : %,d 원 ]\n",money);
		System.out.printf("[ 보유 포인트 : %,d 점 ]\n",bonusPoint);
	}
	
	// 구매 메서드
	void buy(Product p) {
		list.add(p);
//		if(count<10) {
//			list.add(p);
//		}else {
//			System.out.println("구매시 구매내역에 저장이 되지 않습니다.");
//			System.out.println("구매는 정상적으로 이루어집니다.");
//		}
		System.out.println();
		money -= p.price;
		bonusPoint += p.price;
		// 총 구매금액
		total += p.price;
		count++;
	}
	
	// 구매내역 출력
	void cart_info() {
		System.out.print("구매 내역 : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ",((Product)list.get(i)).name);
//			if(count<10) {
//				System.out.printf("%s ",((Product)list.get(i)).name);
	//			// 총 구매금액
	//			total += cart[i].price;
//			}else {
//				System.out.println("카트정보를 볼 수 없음.");
//				break;
//			}
		}
		
		System.out.println();
		System.out.printf("구매 개수 : %,d\n",count);
		System.out.printf("총 구매 금액 : %,d\n",total);
	}
	
	
	
	
//	void buy(Tv t) {
//		System.out.println("TV를 구매합니다.");
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer c) {
//		System.out.println("컴퓨터를 구매합니다.");
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio a) {
//		System.out.println("오디오를 구매합니다.");
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//	
}
