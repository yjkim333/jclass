package j0122;

import java.util.ArrayList;

public class Ja0122_07 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
//		Time t = new Time(1,1,1);
		// 20개를 생성해서 20개 출력
		for (int i = 0; i < 20; i++) {
//			int ranH = (int)(Math.random()*24)+1;
//			int ranM = (int)(Math.random()*60)+1;
//			list.add(new Time(ranH,ranM,ranM));
			list.add(new Time(i+1,i+2,i+3));
		}
		
		// 삭제
		list.remove(1);
		list.remove(7);
		list.remove(10);
		
		for (int i = 0; i < list.size(); i++) {
			Time time = (Time)list.get(i);
			System.out.printf("%d.  %02d:%02d:%02d\n",i+1,time.getHour(),time.getMinute(),time.getSecond());
		}
		
	}

}
