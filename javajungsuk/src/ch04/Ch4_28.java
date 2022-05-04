package ch04;

import java.util.Scanner;

public class Ch4_28 {

	public static void main(String[] args) {

		// do-while문
		int input = 0, answer = 0;
		
		// 1부터 100사이의 난수
		answer = (int)(Math.random() * 100) + 1;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요 > ");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도하세요");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도하세요");
			}
		}while(input != answer);
		
		System.out.println("정답입니다");
		
	}

}
