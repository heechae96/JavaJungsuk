package ch08;

import java.io.File;

public class Ch8_15 {

	public static void main(String[] args) {

		// 메서드에서 예외 선언하기
		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성
		File f = createFile(args[0]);
		System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다");
		File f2 = createFile(args[1]);
		System.out.println(f2.getName()+" 파일이 성공적으로 생성되었습니다");
		// 일부러 2개만 생성..
		File f3 = createFile(args[2]);
		System.out.println(f3.getName()+" 파일이 성공적으로 생성되었습니다");
	}
	
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("파일 이름이 유효하지 않습니다");
			}
		}catch(Exception e) {
			// fileName이 부적절한 경우 대체
			fileName = "제목없음.txt";
		}finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			// 파일생성
			f.createNewFile();
		}catch(Exception e) {}
	}

}
