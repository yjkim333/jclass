package j0120;

// 학생성적
public class Stuscore {
	static int count; // 클래스변수 - 객체선언 없이 클래스명.변수명(공용)
	int no;				  // 인스턴스변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	// 초기화블럭 - 모든 생성자에 공통으로 들어가는 변수 초기화
	{
		++count;
		this.no = count;
	}
	
	// 기본 생성자
	Stuscore(){
//		this.no = count;
//		count++;
	}
	
	// 매개변수 있는 생성자
	Stuscore(String name, int kor, int eng, int math){
//		this.no = count;
//		count++;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	void print() {
		System.out.printf("출력 : %d,%s,%d,%d,%d,%d,%.2f\n",no,name,kor,eng,math,total,avg);
	}
	
	
//	Stuscore(String name){
	////		this.no = count;
	////		count++;
//		this.name = name;
//	}
	
	
	
}
