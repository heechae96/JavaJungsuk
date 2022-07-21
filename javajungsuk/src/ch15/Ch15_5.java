package ch15;

import java.io.*;

public class Ch15_5 {

	public static void main(String[] args) throws IOException {

		// FileInputStream과 FileOutputStream
		
		FileInputStream fis = new FileInputStream(args[0]);
		int data = 0;

		while((data=fis.read())!=-1) {
//			System.out.println("test: " + data);
			char c = (char)data;
			System.out.println(c);
		}
	}

}
