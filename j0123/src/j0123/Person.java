package j0123;

public class Person {
	
	long id; 	  // 주민번호
	String name;  // 이름
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override 	// Object 클래스 메서드 재정의
	public boolean equals(Object obj) { // obj - 비교대상객체
		if(obj!=null && obj instanceof Person) {
//			if(id == ((Person)obj).id) {
//				return true;
//			}else {
//				return false;
//			}
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	@Override	// Object 클래스 메서드 재정의
	public String toString() {
		return id+"";
	}
	
}
