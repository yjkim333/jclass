package star;

public class Tank extends Unit{

	@Override
	void move(int x, int y) {
		System.out.printf("tank 이동 : %d,%d\n",x,y);
	}

}
