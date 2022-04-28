package ch03;

public class Ch3_9 {

	public static void main(String[] args) {

		// 사칙 연산자

		// 오버플로우 발생
		long a = 1_000_000 * 1_000_000;
		// 오버플로우 발생x
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
