package ch05;

public class Ch5_14 {

	public static void main(String[] args) {

		// char배열과 String클래스의 변환
		String src = "ABCDE";
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"): "+ch);
		}
		
		char[] chArr = src.toCharArray();	// String을 char[]로 변환
		
		System.out.println(chArr);	// char배열(char[])을 출력
	}

}
