package j0122;

public class Ja0122_03 {

	public static void main(String[] args) {
		// 다형성
		// 다형성 - 여러가지 형태를 가질 수 있는 능력
		// 하나의 참조변수로 여러 타입의 객체를 참조할 수 있는것
		// 즉, 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것이 다형성. 
		// 하지만 자손에만 있는 변수나 메서드는 이용 못함. => 사용하려면 형변환
		// 관계가 없는 객체는 형변환이 안됨. 상속관계일 때 가능.
		// 자손타입->부모타입(Up-casting) = 형변환 생략
		// 부모타입->자손타입(Down-casting) = 형변환 생략 불가
		
		
		// CaptionTv - text, caption()
		// Tv - power,channel,power(),channelUp(),channelDown()
		CaptionTv c = new CaptionTv();
		c.text = "[MV]로제-APT";
		c.caption();
		System.out.println("자막 : "+c.text);
		
		Tv t = new CaptionTv();
		CaptionTv c3;
		c3 = (CaptionTv)t;
		c3.text = "ㅁㅁ";
		System.out.println(c3.text);
		
		// 에러
//		Tv t2 = new Tv(); 
//		c3 = (CaptionTv)t2;
//		c3.text = "";
//		t2.text = ""; // t2에는 text가 없음.
		
//		CaptionTv c2 = new Tv(); // 자손의 참조변수로 부모의 객체를 다룰 수 없음 - 에러
	}

}
