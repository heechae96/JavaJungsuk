package ch09;

public class Ch9_18 {

	public static void main(String[] args) {

		// StringBuffer의 비교
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + (sb.equals(sb2)));
		
		// StringBuffer의 내용을 String으로 변환
		String s = sb.toString();	// String s = new String(sb);
		String s2 = sb.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
		
	}

}
