package ch03;

public class Ch3_14 {

	public static void main(String[] args) {

		// 사칙 연산자
		char c = 'a';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c= 'A';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c='0';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		
	}

}
