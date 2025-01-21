package jjcard;

public class Point3D extends Point {

	int z;
	Point3D(int x, int y, int z){
//		super(x, y); // 부모에 있는 생성자를 호출하면 에러가 나지 않음. 부모에 기본 생성자가 없을때 사용. 부모에 기본생성자 만들어놓으면 안써도됨. 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : "+x+", "+"y : "+y+","+"z : "+z;
	}
}
