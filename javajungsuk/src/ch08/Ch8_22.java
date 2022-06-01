package ch08;

public class Ch8_22 {

	public static void main(String[] args) {

		// 예외 되던지기(exception re-throwing)
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main 메서드에서 예외가 처리됨");
		}
	}

	static void method1() throws Exception{
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1 메서드에서 예외가 처리됨");
			throw e;
		}
	}
	
}
