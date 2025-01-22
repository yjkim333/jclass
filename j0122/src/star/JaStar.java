package star;

public class JaStar {

	public static void main(String[] args) {
		
		// 추상클래스 - 클래스가 설계도라면 추상클래스는 미완성 설계도
		// 추상메서드(미완성 메서드)를 포함하고 있는 클래스
		// 추상메서드 - 선언부만 있고 구현부가 없는 메서드
		// void aaa(); - 추상메서드(미완성메서드)
		// void bbb(){}; - 완성메서드 - {} 안에 있던 없던 {}있으면 완성.

//		Unit u = new Unit();
		Unit[] u = new Unit[10];
		u[0] = new Marine();
		u[1] = new Marine();
		u[2] = new Marine();
		u[3] = new Tank();
		u[4] = new Tank();
		u[5] = new Tank();
		u[6] = new Tank();
		u[7] = new Dropship();
		u[8] = new Dropship();
		u[9] = new Dropship();
		
		for (int i = 0; i < u.length; i++) {
			u[i].move(100, 100);
		}
		
		
	}

}
