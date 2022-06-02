package ch09;

public class Ch9_13 {

	public static void main(String[] args) {

		// 빈 문자열
		
		// 길이가 0인 char배열을 생성
		char[] cArr = new char[0];		// char[] cArr = {};
		String s = new String(cArr);	// String s = new String("");
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");
		
	}

}
