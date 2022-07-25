package ch15;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ch15_25 {

	public static void main(String[] args) {

		// RandomAccessFile
		
		try {
			RandomAccessFile raf = new RandomAccessFile("test4.dat", "rw");
			System.out.println("파일 포인터 위치 : " + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("파일 포인터 위치 : " + raf.getFilePointer());
			raf.writeLong(100L);
			System.out.println("파일 포인터 위치 : " + raf.getFilePointer());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
