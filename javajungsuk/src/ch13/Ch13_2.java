package ch13;

public class Ch13_2 {

	public static void main(String[] args) throws Exception{

		// 쓰레드
		
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
	}

}

class ThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();		
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
}