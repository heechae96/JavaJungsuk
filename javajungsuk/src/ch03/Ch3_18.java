package ch03;

public class Ch3_18 {

	public static void main(String[] args) {

		// 사칙 연산자
		double pi = 3.141592;
		// round메서드는 매개변수로 받은 값을 소수점 첫째자리에서 반올림 후
		// 그 결과를 정수로 돌려주는 메서드
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
	}

}
