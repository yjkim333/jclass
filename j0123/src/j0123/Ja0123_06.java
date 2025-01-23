package j0123;

import java.util.Scanner;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Object 클래스 - 모든 클래스의 최고 조상 
		// 11개 메서드를 가짐
		// equals - 같으면 true
		
//		Person p1 = new Person(200101011111111L);
//		Person p2 = new Person(200101011111111L);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		// 주소값이 달라서 다른 사람이라고 나옴.
////		if(p1==p2) {
////			System.out.println("같은 사람입니다.");
////		}else {
////			System.out.println("다른 사람입니다.");
////		}
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
		
		
		
//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		if(s1.equals(s2)) {
//			System.out.println("같은 학생");
//		}else {
//			System.out.println("다른 학생");
//		}
		
		
		
		//-----------------------------------------------------
		// hashcode
		
//		String txt = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		String txt2 = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		
//		
//		String txt3 = "안녕하세요.";
//		String str1 = new String("txt");
//		String str2 = new String("txt2");
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
		// --------------------------------------------------------
		
		// clone() - 객체 자신을 복제해서 새로운 객체를 생성하는 메서드
		
//		Point p1 = new Point(3, 5);
//		Point p2 = (Point)p1.clone();	// clone 객체 복사 - try-catch 필요
//		Point p3 = new Point(p1); 		// 객체 복사
//		
//		// 값 변경
//		p1.x = 10;
//		p1.y = 100;
//		p2.x = 100;
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
//		
//		
//		// toString
//		
//		// getClass()
//		
//		
//		// ---------------------------------------------
//		// String 클래스
//		String a = "a";
//		String b = "b";
//		a += b; // String은 a에 b를 더한 것을 a에 넣으면 a="a"공간, b="b"공간, a="ab"공간이 따로따로 새로 생긴다. 메모리를 계속 사용함.
//		System.out.println(a);
		
		
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		
		// ---------------------------------------------
		// .equals => 대소문자 구분 비교
		//.equalsIgnoreCase => 대소문자구분 없이 비교
//		if(str.equalsIgnoreCase(str2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		if(str.equals(str3)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		

		
//		// ---------------------------------------------
		// .charAt => 지정된 위치의 문자 반환 - 문자열을 한개씩 가져올 수 있다.
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
		
		
		
		// concat => 문자열 합치기
//		String str ="안녕";
//		String str2 =" 반가워";
//		System.out.println(str.concat(str2));
		
		
		// split => 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		// 문자열을 숫자로 변경
//		String str = "5";
//		int n = Integer.parseInt(str); // 문자열을 숫자로 변경
//		System.out.println(n);
		
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> 10,9");
//		// 두 수의 합과 곱을 구하시오.
//		String str = scan.next();
//		String[] arr = str.split(",");
//		int n1 = Integer.parseInt(arr[0]);
//		int n2 = Integer.parseInt(arr[1]);
//		System.out.println(n1+n2);
//		System.out.println(n1*n2);
		
//		String str = "1,홍길동,89,100,93,0,0,0";
		// 학번 : 1
		// 이름 : 홍길동
		// 국어 : 100
		// 영어 : 100
		// 수학 : 100
		// 합계 : 300
		// 평균 : 100.0
		// 등수 : 0       => 출력
//		String[] arr = str.split(",");
//		int kor = Integer.parseInt(arr[2]);
//		int eng = Integer.parseInt(arr[3]);
//		int math = Integer.parseInt(arr[4]);
//		int total = kor+eng+math;
//		double avg = total/3.0;
//		
//		System.out.println("번호 : "+arr[0]);
//		System.out.println("이름 : "+arr[1]);
//		System.out.println("국어 : "+kor);
//		System.out.println("영어 : "+eng);
//		System.out.println("수학 : "+math);
//		System.out.println("합계 : "+total);
//		System.out.println("평균 : "+avg);
//		System.out.println("등수 : "+arr[7]);
		
		
		//-----------------------------------------------
		// contains - 문자열 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//
//		// arr 배열에서 홍 있는 이름을 출력
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i].contains(input)) {
//				System.out.println(arr[i]);
//			}
//		}
		
		
		//----------------------------------------------
		// indexOf - 존재하는 위치값 => 없으면 -1 리턴
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		System.out.println("있는 위치 : "+str.indexOf(input));
//		int no = str.indexOf(input);
		
		
		//----------------------------------------------
		// trim : 문자열 전 후 빈공백 제거 - 사이공백은 제거안함.
//		String str = "       안  녕  하    세요.      ";
//		System.out.println(str.trim());
		
		
		//----------------------------------------------
		// replace - 문자를 다른 문자로 대체 - 원본은 변경되지 않음
//		String str = "안녕하세요. 홍길동입니다. 성은 홍입니다.";
//		String input = "김";
//		str.replace("홍", "김"); // str원본은 변경되지 않음
//		System.out.println(str.replace("홍", "김"));
//		System.out.println(str);
		
		// 빈공백 제거
//		String str2 = "       안  녕  하    세요.      ";
//		System.out.println(str2.replace(" ", ""));
		
		
		//----------------------------------------------
		// length() - 문자의 길이
//		String str = "안녕하세요. 반가워요. 홍입니다.";
//		System.out.println(str.length());
		
		// 10자 이상이면 글자를 다시 입력
//		while(true) {
//			System.out.println("10자 이내로 글자를 입력하세요.");
//			String str2 = scan.next();
//			if(str2.length()>10) {
//				System.out.println("10자 이내로 글을 다시 입력하세요.");
//			}else {
//				System.out.printf("입력 글자 : %s, 글자 수 : %d \n",str2,str2.length());
//				System.out.println("종료");
//				break;
//			}
//		}
		
		
		
		// ------------------------------------------------ 
		// endsWith() , startsWith()
		
		// ------------------------------------------------ 
		// substring(시작지점,종료지점+1)
		
//		String str = "1조1234567";
//		System.out.println(str.substring(2));
//		// 1234출력
//		System.out.println(str.substring(2,6));
		
		
//		String[] arr = {"홍길동임","유관순입니다.","이순신이다","강감찬???","김구에요","홍길순","홍길자전거"};
//		// 첫글자 마지막 글자 빼고 모두 출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].substring(1,arr[i].length()-1));
//		}
		
		
		//------------------------------------------------
		// valueOf => String 타입으로 변경/ 원본은 그대로
//		int a = 10;
//		double b = 3.14;
//		String a1 = String.valueOf(a);
//		String a2 = String.valueOf(b);
//		
//		// ""+a; => 문자열로 변경하는 방법
//		String a3 = ""+a;
//		String a4 = ""+b;
		
		
		
		//------------------------------------------------
		// 형변환
//		String str1 = "3.14";
//		double a1 = Double.parseDouble(str1);
//		
//		String str2 = "100";
//		int a2 = Integer.parseInt(str2);
		
				
		
		//------------------------------------------------
		// indexOf
//		String str = "bbaaccAABBCCaaddeeffAAaa";
////		System.out.println(str.indexOf("aa",3));
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if(str.indexOf("aa",i)!=-1) {    //aa가 있을때
//				//System.out.println(str.indexOf("aa",i));
//				i = str.indexOf("aa",i);
//				System.out.println("aa가 존재하는 위치 : "+i);
//				count++;
//			}else { //aa가 없을때
//				break;
//			}
//		}
//		
//		System.out.println("aa 개수 : "+count);
				
		
		
		//------------------------------------------------
		// StringBuffer
//		String a = "a";
//		for (int i = 0; i < 10; i++) {
//			a += i;
//		}
		
//		String a = new String("a");
//		StringBuffer str = new StringBuffer("aaa");
//		System.out.println(a+1+"a"); // a1,a2,a3
//		System.out.println(str.append(2).append("a").append(3.14));
		
		
		
		
		
		
		

	}

}
