package ch09;

import static java.lang.Math.negateExact;
import static java.lang.System.out;

public class Ch9_21 {

	public static void main(String[] args) {

		// 예외를 발생시키는 메서드
		
		int i = Integer.MIN_VALUE;
		
		out.println("i =" + i);
		out.println("-i =" + (-i));
		
		try {
			out.printf("negateExact(%d) = %d%n", 10, negateExact(10));
			out.printf("negateExact(%d) = %d%n", -10, negateExact(-10));
			out.printf("negateExact(%d) = %d%n", i, negateExact(i));	// 예외발생
		}catch(ArithmeticException e) {
			out.printf("negateExact(%d) = %d%n", (long)i, negateExact((long)i));
		}
	}

}
