package ch05;

public class Ch5_15 {

	public static void main(String[] args) {

		// char배열과 String클래스의 변환
		// 문자열을 모르스 부호로 변환하는 예제
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };
		
		String result = "";
		
		// 16진수를 2진수로 변환하는 예제와 동일
		for(int i=0; i<source.length(); i++) {
			result += morse[source.charAt(i) - 'A'];
		}
		
		System.out.println("source: "+source);
		System.out.println("morse: "+result);
	}

}
