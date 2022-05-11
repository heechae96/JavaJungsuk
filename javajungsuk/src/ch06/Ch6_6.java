package ch06;

public class Ch6_6 {

	public static void main(String[] args) {

		// 메서드의 실행 흐름
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		// long이 double로 자동형변환 가능하다
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = "+result1);
		System.out.println("subtract(5L, 3L) = "+result2);
		System.out.println("multiply(5L, 3L) = "+result3);
		System.out.println("divide(5L, 3L) = "+result4);
	}

}

class MyMath{
	long add(long a, long b) {
//		long result = a + b;
//		return result;
		return a + b;
	}
	
	long subtract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}

}
