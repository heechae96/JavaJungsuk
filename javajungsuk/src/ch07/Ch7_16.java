package ch07;

public class Ch7_16 {

	public static void main(String[] args) {

		// 참조변수의 형변환
		Car car = new Car();
		Car car2 = null;
		FireEngin fe = null;
		
		car.drive();
		// 참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용하지 않는다!
		// Car car = new FireEngin();으로 변경하면 실행 가능!
		fe = (FireEngin)car;	
		fe.drive();
		car2 = fe;
		car2.drive();
		
	}

}
/*
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
*/