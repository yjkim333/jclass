package j0122;

public class Car extends Object{
	// private - 같은 클래스 내에서만 사용가능
	String color;
	String gearType;
	int door;
	
	Car(){
		super();
	}
	
	Car(String color, String gearType, int door){
		super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	void drive() {
		System.out.println("자동차가 출발합니다.");
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
	void setDoor(int door) {
		if(door>0 && door<10) {
			this.door = door;
		}
	}
	
	int getDoor() {
		return door;
	}
	
	String getColor() {
//		if() 제약조건으로 private 변수를 넘김
		return color;
	}





}
