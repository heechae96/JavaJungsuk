package ch02;

public class Ch2_8 {

	public static void main(String[] args) {

		// 특수 문자 다루기
		//  '''처럼 할 수 없다
		System.out.println('\'');
		// \b에 의해 3이 지워진다
		// 개행문자 출력하고 개행
		//	이클립스 콘솔 오류로 보임..
		System.out.println("abc\t123\b456");
		System.out.println('\n');
		// 큰 따옴표를 출력하기
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
		
	}

}
