package ch02;

import java.util.Scanner;

public class Ch2_6 {

	public static void main(String[] args) {

		// 화면에서 입력받기 - Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 자리 정수를 하나 입력하세요 > ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.print("실수를 하나 입력하세요 > ");
		String input2 = scanner.nextLine();
		float num2 = Float.parseFloat(input2);
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n",num);
		System.out.println("입력내용 :"+input2);
		System.out.printf("num=%f%n",num2);
		
		// 화면에서 연속적으로 값을 입력받아서 사용하기에 까다롭다
		//	-> 모든 값을 nextLine()으로 입력받아서 적절히 변환하는게 낫다
		System.out.print("두 자리 정수를 하나 입력하세요 > ");
		int num3 = scanner.nextInt();
		System.out.println("입력내용 :"+num3);
		System.out.printf("num=%d%n",num3);
	}

}
