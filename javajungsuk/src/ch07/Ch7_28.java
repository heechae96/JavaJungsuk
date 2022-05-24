package ch07;

class A1{
	void autoPlay(I i) {
		i.play();
	}
}

interface I{
//	public abstract void play();
	void play();
}

class B1 implements I{
	public void play() {
		System.out.println("play in B class");
	}
}

class C1 implements I{
	public void play() {
		System.out.println("play in C class");
	}
}

public class Ch7_28 {

	public static void main(String[] args) {

		// 인터페이스의 이해
		A1 a = new A1();
		a.autoPlay(new B1());
		a.autoPlay(new C1());
	}

}
