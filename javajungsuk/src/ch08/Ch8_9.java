package ch08;

public class Ch8_9 {

	public static void main(String[] args) {

		// 예외 발생시키기
		try {
//			Exception e = new Exception("고의로 예외 발생");
//			throw e;
			// 두 줄 코드를 한 줄로 변경
			throw new Exception("고의로 예외 발생");
		}catch(Exception e) {
			System.out.println("에러메시지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료");
	}

}
