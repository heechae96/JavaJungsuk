package ch15;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class Ch15_18 {

	public static void main(String[] args) {

		// PipedReader와 PipedWriter
		
		InputThread inThread = new InputThread("InputThread");
		OutputThread outThread = new OutputThread("OutputThread");
		
		// PipedReader와 PipedWriter를 연결
		inThread.connect(outThread.getOuput());
		
		inThread.start();
		outThread.start();
	}

}

class InputThread extends Thread{
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	InputThread(String name){
		super(name);	// Thread(String name)
	}
	
	public void run() {
		try {
			int data = 0;
			
			while((data = input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(getName() + " received : " + sw.toString());
		}catch(IOException e) {}
	}
	
	public PipedReader getInput() {
		return input;
	}
	
	public void connect(PipedWriter output) {
		try {
			input.connect(output);
		}catch(IOException e) {}
	}
	
}

class OutputThread extends Thread{
	PipedWriter output = new PipedWriter();
	
	OutputThread(String name){
		super(name);	// Thread(String name)
	}
	
	public void run() {
		try {
			String msg = "Hello";
			System.out.println(getName() + " sent : " + msg);
			output.write(msg);
			output.close();
		}catch(IOException e) {}
	}
	
	public PipedWriter getOuput() {
		return output;
	}
	
	public void connect(PipedReader input) {
		try {
			output.connect(input);
		}catch(IOException e) {}
	}
}
