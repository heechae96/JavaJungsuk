package ch15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Ch15_19 {

	public static void main(String[] args) {

		// StringReader와 StringWriter
		
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while((data = input.read()) != -1) {
				output.write(data);		// void write(int b)
			}
		}catch(IOException e) {}
		
		System.out.println("Input Data  : " + inputData);
		System.out.println("Output Data : " + output.toString());
		System.out.println("output Data : " + output.getBuffer().toString());
	}

}
