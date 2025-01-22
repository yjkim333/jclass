package star;

public class Marine extends Unit {

	@Override	// 상속시 메소드 재정의
	void move(int x, int y) {
		System.out.printf("marine 이동 : %d,%d\n",x,y);
	}

}
