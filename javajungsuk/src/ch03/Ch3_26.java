package ch03;

public class Ch3_26 {

	public static void main(String[] args) {

		// 논리 연산자
		// 효율적인 연산
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n",a,b);
		System.out.printf("a!=0 || ++b!=0 = %b%n",a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n",a,b);
		System.out.printf("a==0 && ++b!=0 %b%n",a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n",a,b);
		
	}

}
