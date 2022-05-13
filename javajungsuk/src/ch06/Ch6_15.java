package ch06;

public class Ch6_15 {

	public static void main(String[] args) {

		// 재귀호출
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if(n == 1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
		}
		
		return result;
	}

}
