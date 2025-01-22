package j0122;

// 시간 날짜
public class Singleton {
	// private - 같은 클래스 접근 제한
	private static Singleton s = new Singleton();
	private Singleton(){}
	private int num;
	
	void setNum(int num) {
		this.num = num;
	}
	int getNum() {
		return num;
	}
	
	public static Singleton getInstance() {
		return s;
	}
	


}
