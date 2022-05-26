package ch08;

public class Ch8_2 {

	public static void main(String[] args) {

		// 예외 처리하기 - try - catch문
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			result = number / (int)(Math.random() * 10);
			System.out.println((i+1)+"번째: "+result);
		}
	}

}
