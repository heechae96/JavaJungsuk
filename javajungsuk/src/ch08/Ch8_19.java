package ch08;

public class Ch8_19 {

	public static void main(String[] args) {
		
		// finally블럭
//		method1();
		Ch8_19.method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아옴");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출");
			return;	// 실행중인 메서드를 종료
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1()의 finally블럭이 실행");
		}
	}
}
