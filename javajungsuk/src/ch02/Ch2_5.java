package ch02;

public class Ch2_5 {

	public static void main(String[] args) {

		// 형식화된 출력 - printf()
		String url = "github.com/heechae96";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		// %g는 값을 간략하게 표현할때 사용
		System.out.printf("f1=%f, %e, %g %n",f1, f1, f1);
		System.out.printf("f2=%f, %e, %g %n",f2, f2, f2);
		System.out.printf("f3=%f, %e, %g %n",f3, f3, f3);

		System.out.printf("d=%f %n",d);			// 소수점 아래 7자리에서 반올림
		System.out.printf("d=%14.10f %n",d);	// 전체 14자리 중 소수점 아래 10자리
		System.out.printf("d=%014.10f %n",d);	// 빈 자리 0으로
		System.out.printf("d=%-14.10f %n",d);	// 좌측 정렬
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n",url);
		System.out.printf("[%30s]%n",url);	// 공간확보후 우측정렬
		System.out.printf("[%-30s]%n",url);	// 공간확보후 죄측정렬
		System.out.printf("[%.8s]%n",url);	// 왼쪽에서 8글자만 출력
	}

}
