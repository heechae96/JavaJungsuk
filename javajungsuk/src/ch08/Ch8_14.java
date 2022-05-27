package ch08;

public class Ch8_14 {

	public static void main(String[] args) {

		// 메서드에서 예외 선언하기
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main에서 예외처리");
			e.printStackTrace();
		}
	}

	static void method1() throws Exception{
		throw new Exception();
	}
}
