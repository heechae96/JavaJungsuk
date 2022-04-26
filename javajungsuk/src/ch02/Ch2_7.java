package ch02;

public class Ch2_7 {

	public static void main(String[] args) {

		// 문자형
		// 마지막은 유니코드
		//	-> 16진 정수의 형식으로 출력(%x, %X)
		char ch = 'A';
		char ch2 = 'a';
		// 어떤 문자의 유니코드를 알고 싶으면, char형 변수에 저장된 값을 정수형(int)로 변환
		int code = (int)ch;
		int code2 = (int)ch2;
		
		System.out.printf("%c=%d(%#X)%n",ch,code,code);
		System.out.printf("%c=%d(%#X)%n",ch2,code2,code2);
		
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n",hch,(int)hch,(int)hch);
	}

}
