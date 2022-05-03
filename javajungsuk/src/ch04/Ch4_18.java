package ch04;

public class Ch4_18 {

	public static void main(String[] args) {

		// 중첩 for문
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i*j);
			}
		}
	}

}
