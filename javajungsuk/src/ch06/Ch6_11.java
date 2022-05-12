package ch06;

public class Ch6_11 {

	public static void main(String[] args) {

		// 기본형 매개변수와 참조형 매개변수
		int[] x = {10};
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
	}

	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change() = x " + x[0]);
	}

}
