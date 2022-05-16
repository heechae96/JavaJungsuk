package ch06;


public class Ch6_27 {

	// 클래스 초기화 블럭
	static {
		System.out.println("static{ }");
	}
	
	// 인스턴스 초기화 블럭 
	{
		System.out.println("{ }");
	}
	
	public Ch6_27() {
		System.out.println("생성자");
	}

	
	public static void main(String[] args) {

		// 초기화 블럭
		System.out.println("Ch6_27 ch = new Ch6_27(); ");
		Ch6_27 ch = new Ch6_27();
		
		System.out.println("Ch6_27 ch2 = new Ch6_27(); ");
		Ch6_27 ch2 = new Ch6_27();
	}

}
