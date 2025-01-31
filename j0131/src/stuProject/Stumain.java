package stuProject;


public class Stumain {

	public static void main(String[] args) {
		int choice;
		StuDeck sd = new StuDeck();
		
		loop:while(true) {
			choice = sd.main_menu(); // 메인메뉴
			
			switch(choice) {
			case 1:
				sd.stu_add(); 		// 학생 성적 입력
				break;
			case 2:
				sd.stu_print_all();	// 학생 성적 출력
				break;
			case 3:
				sd.stu_update();
				break;
			case 4:
				sd.stu_rank();
				break;
			case 0:
				System.out.println("ㅡㅡㅡ [ 프로그램 종료 ] ㅡㅡㅡ");
				break loop;
			}
		}// loop:while
		
		
	}//main

}
