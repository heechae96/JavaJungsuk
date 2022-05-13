package ch06;

public class Ch6_18 {

	public static void main(String[] args) {

		// 재귀호출
		
		// x의 n제곱 구하는 방법
		// f(x, n) = x * f(x, n-1), 단 f(x, 1) = x
		
		// x^1부터 x^n까지의 합
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
	}
	
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x, n-1);
	}

}
