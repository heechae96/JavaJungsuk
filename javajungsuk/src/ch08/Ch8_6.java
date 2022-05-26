package ch08;

public class Ch8_6 {

	public static void main(String[] args) {

		// 예외의 발생과 catch블럭
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// ArithmeticException발생
			System.out.println(4);
		}catch(Exception e){	// ArithmeticException대신 Exception사용
			System.out.println(5);
		}
		System.out.println(6);	
		
		
		
		// 위 과정을 예시로..
		ArithmeticException ae = new ArithmeticException();
		if(ae instanceof Exception) {
			System.out.println("true");
		}

	}

}
