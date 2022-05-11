package ch06;

public class Ch6_8 {
	// JVM의 메모리 구조
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음");
	}

	static void firstMethod() {
		System.out.println("firstMehod()이 시작되었음");
		secondMethod();
		System.out.println("firstMethod()이 끝났음");
	}

	static void secondMethod() {
		System.out.println("secondMehod()이 시작되었음.");
		System.out.println("secondMetod()이 끝났음");
	}

}
