package ch08;

public class Ch8_13 {

	public static void main(String[] args) {

		// 메서드에 예외 선언하기
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		}catch(Exception e){
			System.out.println("method1에서 예외처리");
			e.printStackTrace();
		}
	}

}
