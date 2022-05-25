package ch07;

class InnerEx6{
	Object iv = new Object() {
		void method() {}
	};
	
	static Object cv = new Object() {
		void method() {}
	};
	
	void myMethod() {
		Object lv = new Object() {
			void method() {}
		};
	}
}

public class Ch7_36 {

	public static void main(String[] args) {

		// 익명 클래스
	}

}
