package ch08;

public class Ch8_7 {

	public static void main(String[] args) {

		// 예외의 발생과 catch블럭
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// ArithmeticException발생
			System.out.println(4);
		}catch(ArithmeticException ae){	
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch(Exception e) {	
			// 마지막 블럭에 Exception을 두면 어떠한 예외가 발생해도 처리가능 
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
