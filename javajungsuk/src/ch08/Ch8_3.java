package ch08;

public class Ch8_3 {

	public static void main(String[] args) {

		// 예외 처리하기 - try - catch문
		// Ch8_2를 예외처리
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println((i+1)+"번째: "+result);
			}catch(ArithmeticException e){
				System.out.println((i+1)+"번째: 0으로 나눔(예외처리)");
			}
		}

	}

}
