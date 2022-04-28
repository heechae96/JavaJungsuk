package ch03;

public class Ch3_6_7 {

	public static void main(String[] args) {

		// 사칙 연산자
		byte a = 10;
		byte b = 20;
		// int형보다 작은 byte형이기 때문에 연산자 '+'는 
		// 이 두개의 피연산자들의 자료형을 int형으로 변환한 다음 연산을 수행
		byte c = (byte)(a + b);
		System.out.println(c);
		
		b = 30;
		// 값손실 발생
		// int -> byte
		c = (byte)(a * b);
		System.out.println(c);
	}

}
