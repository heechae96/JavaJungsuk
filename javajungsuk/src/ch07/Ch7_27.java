package ch07;

class A{
	public void methodA(B b) {
		b.methodB();
	}
}

class B{
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class Ch7_27 {

	public static void main(String[] args) {

		// 인터페이스의 이해
		A a = new A();
		a.methodA(new B());
	}

}
