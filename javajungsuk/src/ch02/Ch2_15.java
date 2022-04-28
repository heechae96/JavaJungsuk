package ch02;

public class Ch2_15 {

	public static void main(String[] args) {

		// 정수형과 실수형 간의 형변환
		int i = 91234567;
		float f = (float)i;	// float의 정밀도 7자리
		int i2 = (int)f;
		
		double d = (double)i;	// double의 정밀도 15자리
		int i3 = (int)d;
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i=%d\n",i);
		System.out.printf("f=%f i2=%d\n",f,i2);
		System.out.printf("d=%f i3=%d\n",d,i3);
		System.out.printf("(int)%f=%d\n",f2,i4);
	}

}
