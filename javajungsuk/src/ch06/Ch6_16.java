package ch06;

public class Ch6_16 {

	public static void main(String[] args) {

		// 재귀호출
		int n = 21;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.printf("유요하지 않은 값입니다.(0<n<=20): %d%n",n);
				break;
			}
			
			System.out.printf("%2d!=%20d%n",i,result);
		}
	}
	
	// int로 반환하면 범위 초과!
	static long factorial(int n) {
		// 0이하면 재귀호출만 일어날 뿐 메서가 종료되지 않고
		// 스택에만 계속 쌓이다 스택오버플로우 에러 발생할수 있음
		//	-> 유효성 검사 마찬가지로 필요
		if(n<=0 || n>20) return -1;	// 유효성 검사
		if(n==1) return 1;
		return n * factorial(n-1);
	}

}
