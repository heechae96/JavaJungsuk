package ch13;

public class Ch13_1 {

	public static void main(String[] args) {

		// 쓰레드
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	// 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();
	}

}

class ThreadEx1_1 extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			// 조상인 Thread의 getName()을 호출
			System.out.println(getName());	
		}
	}
}

class ThreadEx1_2 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			// Thread.currentThread()
			System.out.println(Thread.currentThread().getName());
		}
	}
}
