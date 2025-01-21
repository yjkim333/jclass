package j0121;

import java.util.Scanner;

public class Ja0121_04 {

	public static void main(String[] args) {
		// Object 클래스 - 모든 클래스의 최고조상
		// 조상이 없는 클래스는 자동으로 Object클래스를 상속받게 된다.(자동 extends Object)
		// Object의 메서드 11개 전부 상속 - 예_toString..
		//-------------------------

		// 오버라이딩(overriding)
		// 조상클래스로부터 상속 받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것.(메서드 재정의)
		// 조건 - 선언부가 같아야한다.(이름,매개변수,리턴타입)
		//-------------------------

		// super - 참조변수
		// this - 인스턴스 자신을 가리키는 참조변수/ 인스턴스의 주소가 저장.
        //		- 모든 인스턴스 메서드에 지역변수로 숨겨진채로 있음.
		// super - this와 같음. 조상의 멤버와 자신의 멤버를 구별하는 데 사용. =>조상을 가리킴.

		// super() - 생성자
		// 
		//-------------------------

		// 패키지(package)(폴더)
		// 모든 클래스에는 적어도 하나의 패키지는 있어야함.
		// 패키지선언 - 소스파일 첫 문장에 단 한번 선언.
		// 
		
		// import - 앞에 패키지명 생략 가능하게 하는 것.

		
		//-------------------------
		// 제어자 - 클래스,변수,메서드의 선언부에 사용되어 부가적인 의미를 부여한다.
		// 접근제어자와 그외 제어자로 나뉜다.
		// 접근제어자 - public, protected, default, private
		// 그 외 - satitc, final, abstract, native....
		
		// static - 클래스의, 공통적인
		// final - 마지막의, 변경될 수 없는 - 클래스, 메서드, 멤버변수, 지역변수

		
		
		
		// 클래스와 객체는 다르다.
		// 객체선언을 해야 '객체'라고 할 수 있다.
		// 객체 - 저장 공간이 만들어지는 것.
		
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.println("[  카드 게임  ]");
//			System.out.println("원하는 번호를 입력하세요.");
//			int choice = scan.nextInt();
//			
//			switch(choice) {
//			case 1:
//				Deck d = new Deck(); // 객체선언을 해야 객체!
//				break;
//			}
//		}
		
		
		
		// 카드게입
		// 카드게임을 실행합니다.
		// 컴퓨터가 랜덤으로 1개를 뽑고
		// my 1-52카드 중에 내가 1개를 뽑아서
		// 숫자가 높은 사람이 승리 
		// 숫자가 같으면 무늬 스다하클 순
		// 승리 시 100만원 지급 프로그램 구현
		Scanner scan =  new Scanner(System.in);
		int my_money = 0;
		int choice = 0;
		int no = 0;
		
		Card[] c = new Card[52];
		Card com = new Card();
		Card user = new Card();
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] s = {"","Spade","Diamond","Heart","Clover"};
		
		loop:while(true) {
			System.out.println("[   카드 게임   ]");
			System.out.printf("소유금 : %d\n",my_money);
			System.out.println("1. 게임 시작 (참가비 : 300,000원)");
			System.out.println("0. 종료");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				// 카드 52장 생성 & 번호부여
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 13; j++) {
						c[i*13+j] = new Card(s[i+1],j+1);
					}
				}
				
				// 카드 섞기
				Card temp = new Card();
				for (int i = 0; i < 500; i++) {
					int ran = (int)(Math.random()*52);
					temp = c[0];
					c[0] = c[ran];
					c[ran] = temp;
				}
				
				// 컴퓨터 카드 1장 pick
				int ran = (int)(Math.random()*52);
				com = c[ran];
				
				// 유저 카드 1장 pick
				System.out.println();
				System.out.print("카드 번호 선택 >> ");
				no = scan.nextInt();
				System.out.println();
				
				
				
				
				
				
				break;
			default:
				System.out.println("ㅡㅡㅡㅡㅡ 게임 종료 ㅡㅡㅡㅡㅡ");
				break loop;
			}//switch
		}//loop while
		
		
		
		
		
		
	}

}
