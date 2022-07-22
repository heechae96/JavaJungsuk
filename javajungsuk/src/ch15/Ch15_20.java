package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ch15_20 {

	public static void main(String[] args) {

		// BufferedReader와 BufferedWriter
		
		try {
			FileReader fr = new FileReader("/Users/shinheechae"
					+ "/git/javajungsuk/javajungsuk/src/ch15/Ch15_20.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i=1; (line = br.readLine()) != null; i++) {
				// ";"를 포함한 라인을 출력
				if(line.indexOf(";") != -1)
					System.out.println(i + " : " + line);
			}
			br.close();
		}catch(IOException e) {}
	}

}
