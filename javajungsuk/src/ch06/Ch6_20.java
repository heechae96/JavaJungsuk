package ch06;

class MemberCall{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;	// 클래스변수는 인스턴스 변수를 사용할 수 없음
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);	// 클래스메서드에서 인스턴스변수를 사용불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();	// 클래스메서드에서는 인스턴스메서드를 호출 불가
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
public class Ch6_20 {

	public static void main(String[] args) {

		// 클래스 멤버와 인스턴스 멤버간의 참조와 호출
		
	}

}