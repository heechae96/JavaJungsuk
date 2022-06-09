package ch09;

import java.util.StringTokenizer;

public class Ch9_42 {

	public static void main(String[] args) {

		// java.util.StringTokenizer클래스
		
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		for(int i=0; i<result.length; i++)
			System.out.print(result[i] + "|");
		
		System.out.println("개수: " + result.length);
		
		int i = 0;
		for(;st.hasMoreTokens(); i++)
			System.out.print(st.nextToken() + "|");
		
		System.out.println("개수: " + i);
		
		
	}

}
