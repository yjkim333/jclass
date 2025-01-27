package j0127;

public class Stu_main {

	public static void main(String[] args) {
		Stu_deck st = new Stu_deck();
		loop:while(true) {
			int choice = st.main_menu();
			switch(choice) {
				case 1:
					st.Stu_add();
					break;
				case 2:
					st.print_all();
					break;
				case 3:
					st.stu_search();
					break;
				case 4:
					st.stu_update();
					break;
				case 5:
					st.stu_remove();
					break;
				case 6:
					st.stu_rank();
					break;
				case 7:
					st.stu_dataSave();
					break;
				case 0:
					System.out.println("ㅡㅡㅡ[ 프로그램 종료 ]ㅡㅡㅡ");
					break loop;
			}//switch
		}//loop while
		
	}//main
}//class
