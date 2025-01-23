package j0123;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ja0123_05 {

	public static void main(String[] args) {
		// 입출력 에러
		Scanner scan = new Scanner(System.in);
		System.out.println("파일 이름을 입력하세요.");
		String name = scan.next();
		
		File f = createFile(name+".txt");;
		System.out.println("파일이 생성되었습니다.");
				
	}
	
	static File createFile(String fileName) {
		
		File f = new File(fileName);
		try {
			f.createNewFile(); // 파일 생성 - 외부하드디스크에 파일을 1개 생성
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return f;
	}
	

}
