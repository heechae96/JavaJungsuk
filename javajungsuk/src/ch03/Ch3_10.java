package ch03;

public class Ch3_10 {

	public static void main(String[] args) {

		// 사칙 연산자
		int a = 1000000;
		
		// 오버플러우 발생 주의
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n",a,a,a,result1);
		System.out.printf("%d / %d * %d = %d%n",a,a,a,result2);
	}

}
