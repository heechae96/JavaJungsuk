package ch07;

public class Ch7_15 {

	public static void main(String[] args) {

		// 참조변수의 형변환
		Car car = null;
		FireEngin fe = new FireEngin();
		FireEngin fe2 = null;
		
		fe.water();
		car = fe;	// car = (Car)fe;
//		car.water();
		fe2 = (FireEngin)car;	// 조상 -> 자손
		fe2.water();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngin extends Car{
	void water() {
		System.out.println("water!!!");
	}
}