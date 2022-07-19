 package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ch15_1 {

	public static void main(String[] args) {

		// ByteArrayInputStream과 ByteArrayOutputStream
		
		byte[] inSrc = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1) {// 더이상 읽어올 데이터가 없으면 -1반환
			System.out.println(data);
			output.write(data);		// void write(int b)
		}
		
		outSrc = output.toByteArray();	// 스트림의 내용을 byte배열로 변환
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
	}

}
