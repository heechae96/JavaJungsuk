package ch06;

class Tv3 {
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

public class Ch6_4 {

	public static void main(String[] args) {

		// 객체 배열
		Tv3[] tvArr = new Tv3[3];
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv3();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channerUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
	}

}
