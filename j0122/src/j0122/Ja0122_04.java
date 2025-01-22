package j0122;

public class Ja0122_04 {

	public static void main(String[] args) {
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		Ambulance a = null;
		Ambulance a2 = new Ambulance();
		fe.water();
		
		c = fe;
//		c.water(); // water() 공간은 있지만 출력은 되지 않음. 에러
		
		c = a2;
		if( c instanceof FireEngine) {
			fe2 = (FireEngine)c;
			fe2.water();
		} else if( c instanceof Ambulance) {
			// FireEngine -> Ambulance 
			a = (Ambulance)c;
			a.siren();
		}
		
		
		// 매개변수의 다형성
		// 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
		
		
	}

}
