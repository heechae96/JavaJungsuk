package ch04;

import java.util.Scanner;

public class Ch4_11 {

	public static void main(String[] args) {

		// switch문의 중첩
		System.out.print("당신의 주민번호를 입력하세요. (012345-123456) >");
		
		Scanner scan = new Scanner(System.in);
		String regNo = scan.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender) {
			case '1': case '3':
				switch(gender) {
				case '1':
					System.out.println("당신은 2000년 이전에 출생한 남자");
					break;
				case '3':
					System.out.println("당신은 2000년 이후에 출생한 남자");
					break;
				}
				break;
			case '2': case '4':
				switch(gender) {
				case '2':
					System.out.println("당신은 2000년 이전에 출생한 여자");
					break;
				case '4':
					System.out.println("당신은 2000년 이후에 출생한 여자");
					break;
				}
				break;
			default:
				System.out.println("유효하지 않은 주민등록번호");
		}
	}

}
