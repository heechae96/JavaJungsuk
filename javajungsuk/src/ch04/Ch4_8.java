package ch04;

import java.util.Scanner;

public class Ch4_8 {

	public static void main(String[] args) {

		// switch문
		System.out.print("당신의 주민번호를 입력하세요 (123456-123456) > ");
		
		Scanner scan = new Scanner(System.in);
		String regNo = scan.nextLine();
		
		// 8번째 문자를 gender에 저장
		char gender = regNo.charAt(7);
		
		switch(gender) {
			case '1': case '3':
				System.out.println("남성");
				break;
			case '2': case '4':
				System.out.println("여성");
				break;
			default:
				System.out.println("유효하지 않은 주민등록번호입니다");
		}
	}

}
