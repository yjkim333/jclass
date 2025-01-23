package j0123;

import java.util.ArrayList;
import java.util.List;

public class Ja0123_07 {

	public static void main(String[] args) {
		// 컬렉션 프레임웍
		// 컬렉션 - 여러 객체(데이터)를 모아 놓은 것을 의미  ex.ArrayList

		// List , Set , Map

		// List - 순서가 있는 데이터의 집합, 데이터의 중복을 허용.
		// - ArrayList , Vector ...

		// Set - 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않음.
		// - HashSet, TreeSet ...

		// Map - 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합
		// - 순서는 유되지 않으며, 키는 중복을 허용하지 않고 값은 중복을 허용
		// - HashMap, TreeMap, Hashtable, Properties ...
		
		
		// ArrayList 
		// 순서가 있어서 읽을때 그냥 순차적으로 읽으면 된다.
		// 
		
		ArrayList list = new ArrayList();
//		List list2 = new ArrayList();
		
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		list.add(i1);
//		list.add(i2);
//		System.out.println(i1);
		
//		list.add(1); // 1 -> 기본타입 / List -> 객체타입만 넣을 수 있다. => 자동으로 
//		list.add(2); // 1 -> 기본타입 / List -> 객체타입만 넣을 수 있다.
		
		// List => 순서 o 중복 o
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));  // 출력
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		list.remove(0); // index 번호 삭제
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		list.clear(); // 전체 삭제
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		if(list.isEmpty()) { // 값이 있는지 확인
//			System.out.println("없습니다.");
//		}
		
		
		// 값 입력
		for (int i = 0; i < 10; i++) {
			list.add(i+1);
		}
		
		list.add(4,100); // 위치에 값 입력 - 5번째에 100 입력
		
		// 값 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		list.remove(2);
		
		// 값 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 삭제하면 자동으로 지워진 자리를 채우기때문에 뒤에서 부터 지운다.
		for (int i = list.size()-1; i >=0 ; i--) {
			list.remove(i);
		}
		
//		list.clear();// 전체삭제
		
		System.out.println("ㅡㅡㅡ전체 삭제후 출력ㅡㅡㅡ");
		// 값 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		

	}

}
