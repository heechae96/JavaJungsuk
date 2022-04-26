package ch02;

public class Ch2_10 {

	public static void main(String[] args) {

		// 실수형의 범위와 정밀도
		// float의 정밀도 : 7자리
		// double의 정밀도 : 15자리
//		float f = 9.12345678901234567890f;
//		float f2 = 1.234567890123456789f;
//		double d = 9.12345678901234567890d;
		
		float f = 90.12345678901234567890f;
		float f2 = 10.234567890123456789f;
		double d = 90.12345678901234567890d;
		
		System.out.printf("       12345678901234567891234%n");
		// 소수점 이하 6째자리까지 출력
		System.out.printf("f :    %f%n",f);	
		// 앞의 7자리는 일치
		//	-> 정수부 + 소수부 7자리
		System.out.printf("f :  %24.20f%n",f);
		System.out.printf("f2:  %24.20f%n",f2);
		// 앞의 15자리는 일치
		System.out.printf("d :  %24.20f%n",d);
	}

}
