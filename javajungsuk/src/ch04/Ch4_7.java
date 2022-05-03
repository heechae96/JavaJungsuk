package ch04;

import java.util.Scanner;

public class Ch4_7 {

	public static void main(String[] args) {

		// switch문
		System.out.print("가위(1), 바위(2), 보(3), 중 하나를 입력하세요 > ");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		int com = (int)(Math.random() * 3)+1;
		
		System.out.println("당신은 "+user+"입니다");
		System.out.println("컴퓨터는 "+com+"입니다");
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("당신이 졌습니다");
				break;
			case 1: case -2:
				System.out.println("당신이 이겼습니다");
				break;
			case 0:
				System.out.println("비겼습니다");
//			 	break;	// 마지막 문장이므로 break생략 가능
		}
		
	}

}
