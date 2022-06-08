package ch09;

import java.util.StringTokenizer;

public class Ch9_40 {

	public static void main(String[] args) {

		// java.util.StringTokenizer클래스

		String source = "1, 신희채, 100, 100, 100|2, 신희준, 95, 97, 90|3, "
													+ "임희선, 80, 90, 90";
		
		StringTokenizer st = new StringTokenizer(source, "|");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token, ", ");
			while(st2.hasMoreTokens())
				System.out.println(st2.nextToken());
			
			System.out.println("----");
		}
				
	}

}
