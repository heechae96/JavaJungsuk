package ch09;

public class Ch9_16 {

	public static void main(String[] args) {

		// 문자열과 기본형간의 변환
		
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+"+strVal)
										+ Double.parseDouble(strVal2);
		System.out.println(String.join("", strVal, "+", strVal2, "=")+sum);
		
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}

}
