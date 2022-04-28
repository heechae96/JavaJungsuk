package ch03;

public class Ch3_5 {

	public static void main(String[] args) {

		// 사칙 연산자
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
		
		System.out.println("---------");
		// 에러 발생
//		System.out.println(3/0);
		// 무한대(Infinity)출력
		System.out.println(3/0.0);
		// Nan(Not a Number)출력
		System.out.println(3%0.0);
		
	}

}
