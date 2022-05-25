package ch07;

class InnerEx2{
	class InstanceInner{}
	static class StaticInner{}
	
	// 인스턴스멤버 간에는 서로 직접 접근 가능
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 접근 가능
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static맴버는 인스턴스멤버에 직접 접근할 수 없다
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야 한다
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		// 인스턴스 메서드 메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// 메서드내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}

public class Ch7_32 {

	public static void main(String[] args) {

		// 내부 클래스의 제어자와 접근성
		
	}

}
