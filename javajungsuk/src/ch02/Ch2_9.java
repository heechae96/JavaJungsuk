package ch02;

public class Ch2_9 {

	public static void main(String[] args) {

		// 부호있는 정수의 오버플로우
		// 양수 음수 둘 다 가짐
		short sMin = -32768;
		short sMax = 32767;
		// 양수만 가짐
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = "+sMin);
		System.out.println("sMin-1 = "+(short)(sMin-1));
		System.out.println("sMax = "+sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1));
		System.out.println("cMin = "+(int)cMin);
		System.out.println("cMin-1 = "+(int)--cMin);
		System.out.println("cMax = "+(int)cMax);
		System.out.println("cMax+1 = "+(int)++cMax);
		
	}

}
