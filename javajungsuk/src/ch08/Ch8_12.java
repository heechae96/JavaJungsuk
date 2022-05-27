package ch08;

public class Ch8_12 {

	public static void main(String[] args) throws Exception{

		// 메서드에 예외 선언하기
		method1();
		
	}
	
	static void method1() throws Exception{
		method2();
	}
		
	static void method2() throws Exception{
		throw new Exception();
	}

}
