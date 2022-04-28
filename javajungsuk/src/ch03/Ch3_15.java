package ch03;

public class Ch3_15 {

	public static void main(String[] args) {
		
		// 사칙 연산자
		char lowerCase = 'a';
		// 소문자 - 대문자 = 32
		char upperCase = (char)(lowerCase - 32);
		// 리터럴간의 연산 가능!
//		char upperCase = 'a' - 32;	
		System.out.println(upperCase);
	}
}
