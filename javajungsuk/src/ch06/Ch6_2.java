package ch06;

class Tv1 {
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	// Tv의 기능(메서드)
	void power() {
		power = !power;
	}

	void channerUp() {
		++channel;
	}

	void channerDown() {
		--channel;
	}
}

public class Ch6_2 {

	public static void main(String[] args) {

		// 인스턴스의 생성과 사용
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		System.out.println("t1의 channel의 값은 "+t1.channel+"입니다");
		System.out.println("t2의 channel의 값은 "+t2.channel+"입니다");
		
		t1.channel = 7;
		System.out.println("t1의 channel의 값을 7로 변경했습니다");
		
		System.out.println("t1의 channel의 값은 "+t1.channel+"입니다");
		System.out.println("t2의 channel의 값은 "+t2.channel+"입니다");

	}

}
