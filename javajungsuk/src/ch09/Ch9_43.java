package ch09;

import java.math.*;

public class Ch9_43 {

	public static void main(String[] args) throws Exception {

		// java.math.BigInteger클래스
		
		for(int i=0; i<100; i++) {
			System.out.printf("%d!=%s%n", i, calcFactorial(i));
			Thread.sleep(300);	// 0.3초 지연
		}
	}
	
	static String calcFactorial(int n) {
		return factorial(BigInteger.valueOf(n)).toString();
	}
	
	static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}
