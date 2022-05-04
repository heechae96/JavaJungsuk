package ch04;

public class Ch4_24 {

	public static void main(String[] args) {

		// while문
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다");
		
		while(i-- != 0) {
			System.out.println(i);
			
			for(long j=0; j<3_000_000_000L; j++) {}
//			for(long j=0; j<3_000_000_000L; j++);
		}
		System.out.println("GAME OVER");
	}

}
