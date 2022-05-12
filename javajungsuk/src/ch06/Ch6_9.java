package ch06;

class Data {
	int x;
}

public class Ch6_9 {

	public static void main(String[] args) {

		// 기본형 매개 변수와 참조형 매개변수
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main x = " + d.x);
		
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
