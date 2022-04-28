package ch03;

public class Ch3_20 {

	public static void main(String[] args) {

		// 나머지 연산자
		// 음수를 포함한 경우, 피연산자의 부호를 모두 무시하고, 
		// 나머지 연산을 한 결과에 왼쪽 피연산자(나눠지는 수)의 부호를 붙인다
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		System.out.println(10%8);
	}

}
