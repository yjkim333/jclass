package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ja0124_08 {

	public static void main(String[] args) {
		// FileInputStream
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/bbb.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				System.out.print((char)read);
//			}
//			System.out.println();
//			fis.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("프로그램 종료");
		
		
		
		//-------------------------------------------------
		// 글자저장 - FileOutputStream
		try {
			// 폴더 존재확인 및 폴더생성
			String folder = "c:/save3";
			File f = new File(folder);
			if(!f.exists()) {
				f.mkdirs(); // 폴더 생성
				System.out.println("폴더가 생성되었습니다.");
			}
			
			// 파일생성
			File file = new File(folder+"/ccc.hwp");
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
			
			FileOutputStream fos = new FileOutputStream(folder+"/ccc.hwp");
			String str = "1,hong홍,100,100,100,300,100.0,0\r\n";
			str += "2,yoo유,90,90,90,270,90.0,0\r\n";
			
			// String 을 byte 단위로 분리를 해야 함.
			byte[] bytes = str.getBytes(); // .getBytes() - byte 단위로 물리
			for(byte b:bytes) {
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
