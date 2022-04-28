package ch03;

public class Ch3_22 {

	public static void main(String[] args) {

		// 등가비교 연산자
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0==10.0f 	%b%n", 10.0==10.0f);
		// 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 있기 때문
		//	-> 10.0f는 오차없이 저장할 수 있는값
		//	-> 0.1f는 저장할 때 2진수로 변환하는 과정에서 오차가 발생
		//	-> 0.1도 저장되는 과정에서 오차가 발생하지만, float타입의 리터럴보다 적은 오차
		System.out.printf("0.1==0.1f 	%b%n", 0.1==0.1f);
		System.out.printf("f=%19.17f 	%n", f);
		System.out.printf("d=%19.17f 	%n", d);
		System.out.printf("d2=%19.17f 	%n", d2);
		System.out.printf("d==f 		%b%n", d==f);
		System.out.printf("d==d2		%b%n", d==d2);
		System.out.printf("d2==f		%b%n", d2==f);
		System.out.printf("(float)d==f  %b%n",(float)d==f);
	}

}
