package ch15;

import java.io.*;

public class Ch15_6 {

	public static void main(String[] args) {

		// FileInputStream과 FileOutputStream
		
		try {
//			FileInputStream fis = new FileInputStream(args[0]);
//			FileOutputStream fos = new FileOutputStream(args[1]);
			FileInputStream fis = new FileInputStream("/Users/shinheechae/git/javajungsuk/javajungsuk/src/ch15/Ch15_6.java");
			FileOutputStream fos = new FileOutputStream("/Users/shinheechae/git/javajungsuk/javajungsuk/FileCopy.txt");
			
			int data = 0;
			
			while((data=fis.read())!= -1) {
				fos.write(data);	// void write(int b)
			}
			
			fis.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
