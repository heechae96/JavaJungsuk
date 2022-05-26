package ch08;

public class Ch8_1 {

	public static void main(String[] args) {

		// 예외 처리하기 - try - catch문
		try {
			try {} catch(Exception e) {}
		}catch(Exception e) {
			// 에러. line10의 매개변수와 12의 매개 변수가 일치하면 안된다
			try {} catch(Exception e1) {}	
		}
		
		try {
			
		}catch(Exception e) {
			
		}
	}

}
