package jjBuy;

import java.util.ArrayList;

public class Buyer {
	int money = 100000;
	int bonusPoint = 0;
	ArrayList list = new ArrayList(); 
	
	
	Buyer(){}
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	
	// 구매
	void buy(Product p) {
		list.add(p);
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.bonusPoint);
		System.out.printf("현재 잔액 : %,d \n",money);
		System.out.printf("현재 포인트 : %,d \n",bonusPoint);
	}//buy
	
	
	
	
	
}
