package ch02;

public class Ch2_11 {

	public static void main(String[] args) {

		// 부동소수점의 오차
		float f = 9.1234567f;
		// float타입의 값을 int타입의 값으로 해석해서 반환
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n",f);
		System.out.printf("%X%n",i);
	}

}
