package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch15_7 {

	public static void main(String[] args) {

		// BufferedInputStream과 BufferedOutputStream
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			// BufferedInputStream의 버퍼 크기를 5로 한다
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			// 파일 123.txt에 1부터 9까지 출력한다
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
//			fos.close();
			bos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
