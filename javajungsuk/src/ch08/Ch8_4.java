package ch08;

public class Ch8_4 {

	public static void main(String[] args) {

		// try - catch문에서의 흐름
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// 일부러 예외 발생
			System.out.println(4);
		}catch(ArithmeticException ae){
			System.out.println(5);
		}
		System.out.println(6);
	}

}
