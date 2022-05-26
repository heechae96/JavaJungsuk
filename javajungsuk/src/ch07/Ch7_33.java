package ch07;

class InnerEx3{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근 불가
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;	// JDK1.8부터 final 생략 가능
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			
			// 외부 클래스의 지역변수는 final이 붙은 변수 (상수)만 접근 가능
			int liv3 = lv;	// 에러! (JDK1.8부터 에러 아님)
			int liv4 = LV;
		}
	}
}
public class Ch7_33 {

	public static void main(String[] args) {

		// 내부 클래스의 제어자와 접근성
	}

}