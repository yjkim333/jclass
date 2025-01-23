package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.print.attribute.HashAttributeSet;

public class Ja0123_08 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		// 값 입력
//		for (int i = 0; i < 10; i++) {
//			list.add(i+1);
//		}
//
//		// 기본형태 - 데이터 읽어오기
//		Iterator i1 = list.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		// 편하게 사용하는 형태
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		
		// Set - 순서 x 중복 x
		
		HashSet set = new HashSet();
		set.add(4);
		set.add("aaa");
		set.add(1); // 안들어감 - 중복 불가
		set.add("bbb");
		set.add(3);
		set.add(2);
		set.add(1);
		set.add("ccc");
		
		System.out.println("개수 : "+set.size());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
	}

}
