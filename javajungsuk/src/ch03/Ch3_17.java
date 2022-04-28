package ch03;

public class Ch3_17 {

	public static void main(String[] args) {

		// 사칙 연산자
		double pi = 3.141592;
		// 소수점 넷째자리에서 반올림 하기 위해서
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(shortPi);
	}

}
