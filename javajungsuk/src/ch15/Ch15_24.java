package ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ch15_24 {

	public static void main(String[] args) {

		// 표준 입출력 - setOut(), setErr(), setIn()
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test3.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);		// System.out의 출력대상을 test3.txt파일로 변경
//			System.setErr(ps);
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
	}

}
