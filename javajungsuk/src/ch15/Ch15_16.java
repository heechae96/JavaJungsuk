package ch15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ch15_16 {

	public static void main(String[] args) {

		// FileReader와 FileWriter
		
		try {
			String fileName = "testCh15_16.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			
			// FileInputStram을 이용해서 파일내용을 읽어 화면에 출력한다
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			// FileReader을 이용해서 파일내용을 읽어 화면에 출력한다
			while((data=fr.read()) != -1) {
//				System.out.print(data +" ");
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
