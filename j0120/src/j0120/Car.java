package j0120;

public class Car {
	String color;
	String gearType;
	int door;

	// this - 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음. 
	Car(){  // 기본생성자
		this("black","auto",4);
//		color = "black";
//		gearType = "auto";
//		door = 4;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String color,String gearType, int door){  // 매개변수가 있는 생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
