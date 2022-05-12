package ch06;

class Data1{
	int x;
}

public class Ch6_10 {

	public static void main(String[] args) {
		
		// 클래스 변수와 인스턴스 변수
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data1 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
