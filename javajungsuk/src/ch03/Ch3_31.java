package ch03;

public class Ch3_31 {

	public static void main(String[] args) {

		// 쉬프트 연산자 ( << >> )
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%x%n", hex);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("hex=%#X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
	}

}
