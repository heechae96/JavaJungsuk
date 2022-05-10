package ch06;

class Tv{
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(메서드)
	void power() {power = !power;}
	void channerUp() {++channel;}
	void channerDown() {--channel;}	
}

public class Ch6_1 {
	
	public static void main(String[] args) {
		
		// 인스턴스의 생성과 사용
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channerDown();
		System.out.println("현재 채널은 "+t.channel+"입니다");
	}

}
