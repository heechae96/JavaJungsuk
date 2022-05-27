package ch08;

import java.io.File;

public class Ch8_16 {

	public static void main(String[] args) {

		// 메서드에서 예외 선언하기
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"파일이 성공적으로 생성");
		}catch(Exception e) {
			System.out.println(e.getMessage()+" 다시 입력하시오");
		}
	}

	static File createFile(String fileName) throws Exception{
		if (fileName==null || fileName.equals(""))
			throw new Exception("파일 이름이 유효하지 않습니다");
		File f = new File(fileName);	// File클래스 객체 생성
		// 메서드를 이용해 실제 파일 생성
		// 예외처리를 하지 않기때문에 메서드를 굳이 만들지 않는다
		//	Ch8_15와의 차이
		f.createNewFile();	
		return f;
	}
}
