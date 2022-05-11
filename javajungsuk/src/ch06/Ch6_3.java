package ch06;

class Tv2 {
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

public class Ch6_3 {

	public static void main(String[] args) {

		// 인스턴스의 생성과 사용
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		System.out.println("t1의 channel의 값은 "+t1.channel+"입니다");
		System.out.println("t2의 channel의 값은 "+t2.channel+"입니다");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경했습니다");
		System.out.println("t1의 channel의 값은 "+t1.channel+"입니다");
		System.out.println("t2의 channel의 값은 "+t2.channel+"입니다");

	}
	

}
