package ch07;

public class Ch7_5 {

	public static void main(String[] args) {

		// super
		Child c = new Child();
		c.method();
	}

}

class Parent{
	int x = 10;
}

class Child extends Parent{
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}