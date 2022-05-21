package ch07;

public class Ch7_17 {

	public static void main(String[] args) {

		// instanceof연산자
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof Car2) {
			System.out.println("This is a Car2 instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
		
		System.out.println(fe.getClass().getName());	// 클래스의 이름을 출력
	}

}
class Car2{}
class FireEngine extends Car2{}