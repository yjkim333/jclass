package j0124;

public class Ja0124_03 {

	public static void main(String[] args) {
		//---------------------------------------------------------------
		// 쓰레드(thread)
		// 싱글쓰레드 - 프로세스 + 쓰레드
		// 멀티쓰레드 - 프로세스 + 쓰레드 + 쓰레드 ...
		// Thread 클래스 상속 해서 사용 => .start()
		
		//---------------------------------------------------------------
		// 싱글쓰레드
//		for (int i = 0; i < 300; i++) {
//			System.out.println("i : "+i);
//		}
//		System.out.println("---------------");
//		for (int j = 0; j < 300; j++) {
//			System.out.println("j : "+j);
//		}
		
		//---------------------------------------------------------------
		// 멀티쓰레드
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();

		
		
		
		
	}

}
