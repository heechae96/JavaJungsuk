package ch06;

public class Ch6_7 {
	// JVM의 메모리 구조
	public static void main(String[] args) {
		firstMethod();		// static메서드는 객체 생성없이 호출가능
	}

	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("seceondMethod()");
	}
}
