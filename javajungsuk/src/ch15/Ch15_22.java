package ch15;

import java.io.IOException;

public class Ch15_22 {

	public static void main(String[] args) {

		// 표준 입출력 - System.in, System.out, System.err
		
		try {
			int input = 0;
			
			while((input = System.in.read()) != -1) {
				System.out.println("input : " + input + ", (char)input : " 
															+ (char)input);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
