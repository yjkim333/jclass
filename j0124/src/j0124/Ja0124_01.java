package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0124_01 {

	public static void main(String[] args) {
		// List - 순서ㅇ 중복ㅇ
		
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,99)); // 1명 입력X
//		list.add(new Stu("유관순",90,90,99)); // 1명 입력X
//		list.add(new Stu("이순신",80,80,89)); // 1명 입력X
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(80);
//		s1.setMath(88);
//		list.add(s1);
//		
//		for (int i = 0; i < list.size(); i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.println(s.getNo()+", "+s.getName());
//		}

		
		
		//---------------------------------------------------------------
		// Set - 순서 x, 중복 x
		
//		HashSet set = new HashSet();
//		set.add(1);
//		set.add(2);
//		set.add(2);	// 중복은 안들어감
//		set.add(3);
//		
//		Iterator i = set.iterator(); // 1회성 선언
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		i = set.iterator(); // 출력은 무조건 1번 더 선언해야 함.
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		//---------------------------------------------------------------
		// Map - 순서 x, 중복(키 x, 값 o)
		// key,value => Json 형태
		
		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99));
		list.add(new Stu("유관순",90,90,99));
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "aaa"); // map에 저장
		map.put("userPw", "1111");
		map.put("userName", "홍길동");
//		map.put("list", list);
		
		// .containsKey("키값") - key가 있는지 확인
//		System.out.println(map.containsKey("userId"));
		// .containsKey("밸류") - value가 있는지 확인
//		System.out.println(map.containsValue("1111"));
		
		if(map.containsKey("userId")==true){
			System.out.println(map.get("userId")); // map에서 key에 해당되는 값 출력
		}
		
		// map.get(key)
//		System.out.println("id : "+map.get("userId"));
//		System.out.println("id : "+map.get("userId2"));
//		System.out.println("pw : "+map.get("userPw"));
//		System.out.println("list : "+map.get("list"));
		
		
		// map에 있는 list 컬렉션 출력
//		ArrayList list2 = (ArrayList)map.get("list");
//		
//		for (int i = 0; i < list2.size(); i++) {
//		Stu s = (Stu)list2.get(i);
//		System.out.println(s.getNo()+", "+s.getName());
//		}
		
		
		// 전체 출력 - Iterator 활용
//		Iterator i = map.entrySet().iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		

		
		
		
		
		
		
		
		
	}// main

}
