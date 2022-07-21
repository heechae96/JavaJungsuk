package ch15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ch15_10 {

	public static void main(String[] args) {

		// DataInputStream과 DataOutputStream
		
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());		// 10
			System.out.println(dis.readFloat());	// 20.0f
			System.out.println(dis.readBoolean());	// true
			dis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
