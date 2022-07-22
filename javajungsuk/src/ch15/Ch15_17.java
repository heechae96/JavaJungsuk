package ch15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ch15_17 {

	public static void main(String[] args) {

		// FileReader와 FileWriter
		
		try {
//			FileReader fr = new FileReader(args[0]);
			FileReader fr = new FileReader("/Users/shinheechae/"
					+ "git/javajungsuk/javajungsuk/src/ch15/Ch15_17.java");
//			FileWriter fw = new FileWriter(args[1]);
			FileWriter fw = new FileWriter("convertion.txt");
			
			int data = 0;
			while((data = fr.read()) != -1) {
				if(data != '\t' && data != '\n' && data != ' ' && data != '\r')
					fw.write(data);
			}
			
			fr.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
