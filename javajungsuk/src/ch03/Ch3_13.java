package ch03;

public class Ch3_13 {

	public static void main(String[] args) {

		// 사칙 연산자
		char c1 = 'a';
		
//		char c2 = c1 + 1;	// 컴파일 에러!!
		
		// 아래 코드는 원래라면 에러발생
		// int -> char 
		// but. 리터럴 간의 연산이기 때문에 가능
		// 		상수또는 리터럴 간의 연산은 실행과정동안 변하는 값이 아니기 때문에
		//		컴파일러가 계산해서 그 결과로 대체함으로써 코드를 보다 효율적으로 만듦
		char c2 = 'a' + 1;
		//char c2 = 'b';
		
		System.out.println(c2);
	}

}
