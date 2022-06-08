package ch09;

import java.util.StringTokenizer;

public class Ch9_39 {

	public static void main(String[] args) {

		// java.util.StringTokenizer클래스

		String expression = "x=100*(200+300)/2";
		// true를 빼면 구분자는 토근에서 제외!
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
