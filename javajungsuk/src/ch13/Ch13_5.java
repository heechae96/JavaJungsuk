package ch13;

public class Ch13_5 {

	static long startTime = 0;
	
	public static void main(String[] args) {

		// 멀티쓰레드와 싱글쓰레드
		
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간1: " 
					+ (System.currentTimeMillis()-Ch13_5.startTime));
	}

}

class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.print("소요시간2: " 
					+ (System.currentTimeMillis()-Ch13_5.startTime));
	}
}
