package ch09;

import java.util.StringTokenizer;

public class Ch9_38 {

	public static void main(String[] args) {

		// java.util.StringTokenizer클래스
		
		String source = "100, 200, 300, 400";
		StringTokenizer st = new StringTokenizer(source, ", ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
