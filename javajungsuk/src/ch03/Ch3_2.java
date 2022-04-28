package ch03;

public class Ch3_2 {

	public static void main(String[] args) {

		// 증감 연산자(단독으로 사용되지 않은 경우)
		int i = 5, j = 0;
		
		j = i++;
		System.out.println("j = i++; 실행 후, i = "+i+", j = "+j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i; 실행 후, i = "+i+", j = "+j);
		
		
	}

}
