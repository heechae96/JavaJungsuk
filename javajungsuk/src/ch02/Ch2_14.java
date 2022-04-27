package ch02;

public class Ch2_14 {

	public static void main(String[] args) {

		// 실수형 간의 형변환
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		double d3 = (double)9.1234567f;
		
		System.out.printf("f = %20.18f\n",f);
		System.out.printf("d = %20.18f\n",d);
		// 저장할때 이미 값이 달라졌기 때문에, 형변환을 해도 값이 같아지지 않는다
		System.out.printf("d2 = %20.18f\n",d2);
		System.out.printf("d3 = %20.18f\n",d3);
	}

}
