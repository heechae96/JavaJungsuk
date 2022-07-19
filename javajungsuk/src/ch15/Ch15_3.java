package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ch15_3 {

	public static void main(String[] args) {

		// ByteArrayInputStream과 ByteArrayOutputStream
		
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];	// 이전 예제와 배열의 크기가 다르다 
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) {
				// 스트림으로부터 읽어 올 수 있는 데이터의 크기를 반환
				input.read(temp);
				output.write(temp);
//				int len = input.read(temp);
//				output.write(temp, 0, len);
//				System.out.println("temp : " + Arrays.toString(temp));
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		}catch(IOException e) {}
	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp		  : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}
